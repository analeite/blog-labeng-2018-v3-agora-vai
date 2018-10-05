<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<div>
		<jsp:include page="../../public/layout/menu.jsp" />
	</div>

	<br>
	<br>
	<div class="container-fluid">
		<div class="row">
			<div class="col-1"></div>
			<div class="col-7">
				<div class="card mb-3">
					<div class="card-body">
					<h5 class="card-title text-center font-sub">Contato</h5>
						<form>
							<div class="form-group">
								<label for="exampleFormControlInput1">Nome Completo</label> <input
									type="email" class="form-control" id="exampleFormControlInput1"
									placeholder="Ana Beatriz Araujo">
							</div>
							
							<div class="form-group">
								<label for="exampleFormControlInput1">E-Mail</label> <input
									type="email" class="form-control" id="exampleFormControlInput1"
									placeholder="ana@beatriz.com">
							</div>

							<div class="form-group">
								<label for="exampleFormControlTextarea1">Mensagem</label>
								<textarea class="form-control" id="exampleFormControlTextarea1"
									rows="10" placeholder="Escreva sua mensagem aqui"></textarea>
							</div>
							<button type="submit" class="btn btn-primary">Enviar</button>
						</form>

					</div>
				</div>
			</div>
			<div class="col-2">
				<div class="card" style="width: 18rem;">
					<img class="card-img-top"
						src="../../public/imagens/2018-08-21 02.32.58 1.jpg"
						alt="Card image cap">
					<div class="card-body">
						<h5 class="card-title text-center font-sub">Ana Beatriz
							Araujo</h5>
						<p class="card-text text-center">“É melhor manter as palavras
							tristes, ruins, más, desagradáveis separadas, onde possam ser
							vigiadas pra gente ter certeza de que não vão nos pegar de
							surpresa.”</p>
					</div>
					<ul class="list-group list-group-flush text-center">
						<li class="list-group-item"><a href="#" class="card-link">Livros</a>
							<a href="#" class="card-link">Músicas</a></li>
						<li class="list-group-item"><a href="#" class="card-link">Séries</a>
							<a href="#" class="card-link">Filmes</a></li>
						<li class="list-group-item"><a href="#" class="card-link">Espiritualidade</a>
							<a href="#" class="card-link">Conselhos</a></li>
						<li class="list-group-item"><a href="#" class="card-link">Testemunhos</a>
							<a href="#" class="card-link">Fotos</a></li>
					</ul>

				</div>
			</div>
		</div>
	</div>

	<footer class="footer">
	<div class="container">
		<p class="text-muted font-sub text-center">Design por Ana Beatriz
			Araujo © 2018</p>
	</div>
	</footer>

</body>
</html>