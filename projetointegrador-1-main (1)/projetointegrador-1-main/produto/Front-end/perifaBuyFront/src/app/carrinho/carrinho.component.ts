import { Component, OnInit } from '@angular/core';
import { Carrinho } from '../model/carrinho';
import { Produto } from '../model/produto';
import { AuthService } from '../service/auth.service';
import { CarrinhoService } from '../service/carrinho.service';
import { ProdutoService } from '../service/produto.service';

@Component({
  selector: 'app-carrinho',
  templateUrl: './carrinho.component.html',
  styleUrls: ['./carrinho.component.css']
})
export class CarrinhoComponent implements OnInit {
  produto:Produto = new Produto();
  carrinho:Carrinho = new Carrinho();

  listaCarrinho:Carrinho[];

  valorFrete: number = 0.0;

  constructor(
    private authService:AuthService,
    private carrinhoService:CarrinhoService,
    private produtoService:ProdutoService
  ) { }

  ngOnInit(){

    window.scroll(0,0);
  }



  findAllCarrinho(){
    this.carrinhoService.getByIdCarrinho().subscribe((resp:Carrinho[])=>{
      this.listaCarrinho = resp
      console.log(this.listaCarrinho)
    })
  }

  remover(id:number){
    console.log(id)
    this.carrinhoService.DeleteById(id).subscribe(()=>{
      alert('Removido do carrinho com sucesso')
      this.findAllCarrinho
    })
  }
}
