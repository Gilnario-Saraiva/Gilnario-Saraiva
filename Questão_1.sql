select * from Pessoa
inner join Física
on pess_id = fisc_pessoa
where fisc_cpf is null