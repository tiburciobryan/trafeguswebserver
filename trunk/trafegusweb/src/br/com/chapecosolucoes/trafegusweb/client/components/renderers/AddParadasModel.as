package br.com.chapecosolucoes.trafegusweb.client.components.renderers
{
	import br.com.chapecosolucoes.trafegusweb.client.vo.ParadaVO;

	[Bindable]
	public class AddParadasModel
	{
		public function AddParadasModel()
		{
		}
		public var parada:ParadaVO = new ParadaVO();
	}
}