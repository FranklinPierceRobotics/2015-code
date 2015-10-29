package penner.easing;

public class Easing {

	public static float easeWithStringFunction(String easingFunction, float t, float b, float c, float d)
	{
		switch(easingFunction)
		{
		case "easeBackIn":
			return EasingBack.easeIn(t, b, c, d);
		case "easeBackOut":
			return EasingBack.easeOut(t, b, c, d);
		case "easeBackInOut":
			return EasingBack.easeInOut(t, b, c, d);
			
		case "easeBounceIn":
			return EasingBounce.easeIn(t, b, c, d);
		case "easeBounceOut":
			return EasingBounce.easeOut(t, b, c, d);
		case "easeBounceInOut":
			return EasingBounce.easeInOut(t, b, c, d);
			
		case "easeCircIn":
			return EasingCirc.easeIn(t, b, c, d);
		case "easeCircOut":
			return EasingCirc.easeOut(t, b, c, d);
		case "easeCircInOut":
			return EasingCirc.easeInOut(t, b, c, d);
			
		case "easeCubicIn":
			return EasingCubic.easeIn(t, b, c, d);
		case "easeCubicOut":
			return EasingCubic.easeOut(t, b, c, d);
		case "easeCubicInOut":
			return EasingCubic.easeInOut(t, b, c, d);
			
		case "easeElasticIn":
			return EasingElastic.easeIn(t, b, c, d);
		case "easeElasticOut":
			return EasingElastic.easeOut(t, b, c, d);
		case "easeElasticInOut":
			return EasingElastic.easeInOut(t, b, c, d);
			
		case "easeExpoIn":
			return EasingExpo.easeIn(t, b, c, d);
		case "easeExpoOut":
			return EasingExpo.easeOut(t, b, c, d);
		case "easeExpoInOut":
			return EasingExpo.easeInOut(t, b, c, d);
			
		case "easeLinearIn":
			return EasingLinear.easeIn(t, b, c, d);
		case "easeLinearOut":
			return EasingLinear.easeOut(t, b, c, d);
		case "easeLinearInOut":
			return EasingLinear.easeInOut(t, b, c, d);
			
		case "easeQuadIn":
			return EasingQuad.easeIn(t, b, c, d);
		case "easeQuadOut":
			return EasingQuad.easeOut(t, b, c, d);
		case "easeQuadInOut":
			return EasingQuad.easeInOut(t, b, c, d);
			
		case "easeQuartIn":
			return EasingQuart.easeIn(t, b, c, d);
		case "easeQuartOut":
			return EasingQuart.easeOut(t, b, c, d);
		case "easeQuartInOut":
			return EasingQuart.easeInOut(t, b, c, d);
			
		case "easeQuintIn":
			return EasingQuint.easeIn(t, b, c, d);
		case "easeQuintOut":
			return EasingQuint.easeOut(t, b, c, d);
		case "easeQuintInOut":
			return EasingQuint.easeInOut(t, b, c, d);
			
		case "easeSineIn":
			return EasingSine.easeIn(t, b, c, d);
		case "easeSineOut":
			return EasingSine.easeOut(t, b, c, d);
		case "easeSineInOut":
			return EasingSine.easeInOut(t, b, c, d);
			
		case "easeLinearNone":
			default:
				return EasingLinear.easeNone(t, b, c, d);
		}
	}

}
