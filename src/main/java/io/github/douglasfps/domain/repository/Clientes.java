package io.github.douglasfps.domain.repository;

import io.github.douglasfps.domain.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Clientes {
    private static String insert = " INSERT INTO CLIENTE (NOME) VALUES (?) ";
    private static String listarTodos = "SELECT * FROM CLIENTE";

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public Cliente salvar(Cliente c){
        jdbcTemplate.update(insert, new Object[]{c.getNome()} );
        return c;
    }

   public List<Cliente> obterTodos(){
        return jdbcTemplate.query(listarTodos, new RowMapper<Cliente>() {
            @Override
            public Cliente mapRow(ResultSet resultSet, int i) throws SQLException {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                return new Cliente(id,nome);
            }
        });
   }
}
