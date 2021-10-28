<ui:composition xmlns="http://www.w3.org/1999/xhtml"
    xmlns:h="http://java.sun.com/jsf/html"
    xmlns:f="http://java.sun.com/jsf/core"
    xmlns:ui="http://java.sun.com/jsf/facelets"
    xmlns:p="http://primefaces.org/ui"
    template="/paginas/default/main.xhtml">

    <ui:define name="content">
        <h1 class="page-header ">
            <i class="fa fa-comments"></i> Formulário
        </h1>
                <div class="form-group">
        <div class="col-xs-2">

        <h:form>
            <b><h:outputText value="Nome: " /></b>
			value="#{UsuarioBean.usuario.nome}"
            <h:inputText class="form-control" id="nome" value="" />
            <br style="clear: left;" />
        </h:form>
        <h:form>
            <b><h:outputText value="Data: " /></b>
            <h:inputText class="form-control" value="#{now}">  
                <f:convertDateTime pattern="dd/MM/yyyy HH:mm" timeZone="America/Sao_Paulo"/>  
            </h:inputText>
            <br style="clear: left;" />

        </h:form>
        </div>
        <div class="col-md-8">
        <h:form>
            <td valign="top">
            <b><h:outputText title="Ajuda" value="Frase: " /></b>
            </td>
            <h:inputTextarea class="form-control"  cols="80" rows="8" id="frase" value="" />
        </h:form>
            </div>
            </div>
        <br style="clear: left;" />
        <div class="container">
</div>

<div class="col-xs-2">

<h:form>
                        <h:commandButton id="submitBtn"  var="item" value="Incluir" class="btn btn-success" action="#{UsuarioJDCBDAO.inserir(Usuario)}">
                            <f:param name="Nome" value="#{item.nome}" />
                            <f:param name="Data" value="#{item.dataCadastro}" />
                            <f:param name="Frase" value="#{item.frase}" />
                        </h:commandButton>
                    </h:form>
</div>
    </ui:define>
</ui:composition>
