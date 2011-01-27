package br.com.chapecosolucoes.trafegusweb.client.vo
{
	import flash.events.Event;
	
	public class CarretaSelecionadaEvent extends Event
	{
		public static const CARRETA_SELECIONADA_EVENT:String = "carretasSelecionadaEvent";
		public var carreta:VeiculoVO;
		public function CarretaSelecionadaEvent(type:String,carreta:VeiculoVO, bubbles:Boolean=false, cancelable:Boolean=false)
		{
			this.carreta = carreta;
			super(type, bubbles, cancelable);
		}
		override public function clone():Event
		{
			return new CarretaSelecionadaEvent(type,carreta,bubbles,cancelable);
		}
	}
}