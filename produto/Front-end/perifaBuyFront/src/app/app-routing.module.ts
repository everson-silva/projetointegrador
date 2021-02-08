import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EntrarComponent } from './entrar/entrar.component';
import { CadastroUsuarioComponent } from './cadastro-usuario/cadastro-usuario.component';
import { CarrinhoComponent } from './carrinho/carrinho.component';
import { FormaPagamentoComponent } from './forma-pagamento/forma-pagamento.component';
import { InicioComponent } from './inicio/inicio.component';
import { ComponenteLojaFarmaciaComponent } from './componente-loja-farmacia/componente-loja-farmacia.component';
import { CadastroProdutoComponent } from './cadastro-produto/cadastro-produto.component';
import { ContatoComponent } from './contato/contato.component';
import { CadastroEmpresaComponent } from './cadastro-empresa/cadastro-empresa.component';
import { RestauranteComponent } from './restaurante/restaurante.component';
import { ServicosGeraisComponent } from './servicos-gerais/servicos-gerais.component';
import { MerceariasComponent } from './mercearias/mercearias.component';
import { PadariaComponent } from './padaria/padaria.component';


const routes: Routes = [
  {path:'', redirectTo:'inicio', pathMatch:'full'},
  {path:'entrar', component: EntrarComponent},
  {path:'cadastro-empresa', component: CadastroEmpresaComponent},
  {path:'cadastro-usuario', component: CadastroUsuarioComponent},
  {path:'carrinho', component: CarrinhoComponent},
  {path:'cadastro-produto', component: CadastroProdutoComponent},
  {path:'forma-pagamento', component: FormaPagamentoComponent},
  {path:'inicio', component: InicioComponent},
  {path:'componente-loja-farmacia', component: ComponenteLojaFarmaciaComponent},
  {path:'restaurante', component: RestauranteComponent},
  {path:'servicos-gerais', component: ServicosGeraisComponent},
  {path:'mercearia', component: MerceariasComponent},
  {path:'contato', component: ContatoComponent},
  {path:'padaria', component: PadariaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
