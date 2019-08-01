//  json exibindo assim:
 
[
    {
        "CRM": "7618",
        "NaturezaDaOp": "1",
        "DataDeEmissao": "jun 16, 2017",
        "OptanteSimplesNacional": "2",
        "IncentivadorCultural": "2",
        "Status": "2",
        "Servico": {
...
	}
]
 
// E gostaria que ele exibisse com nfs em cima, tipo:
 
nfs:
    {
        "CRM": "7618",
        "NaturezaDaOp": "1",
        "DataDeEmissao": "jun 16, 2017",
        "OptanteSimplesNacional": "2",
        "IncentivadorCultural": "2",
        "Status": "2",
        "Servico": {

....
	}
//  Alguém sabe de algum comando ou onde, no servlet, eu coloco isso? (Segue o servlet abaixo)

 
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
  		List<NotaFiscal> nf = nfs.retornaTodasNF();

		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		String json =  gson.toJson(nf);
		ServletUtil.writerJSON(resp, json);