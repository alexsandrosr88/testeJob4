<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Página com Select Centralizado</title>
    <style>
        #divMain{
            width: 50%;
            margin: auto;
            padding: 10px;
            text-align: center;
        }
        p,select {
            padding: 10px;
            font-size: 16px;
        }

    </style>
</head>
<body>
<div id="divMain">
<h2> Lista de números inteiros aletórios</h2>
<select>
    <option value="">Escolha</option>
    <#list lista as n>
        <option value="${n}">${n}</option>
    </#list>
</select>
    <p>Experimente atualizar a página e consultar os números novamente.</p>
</div>
</body>
</html>