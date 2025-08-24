package net.mcreator.pritchvolution.procedures;

import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

public class PritchanimalModelVisualScaleProcedure {
	public static double execute() {
		return Mth.nextDouble(RandomSource.create(), 0.5, 2);
	}
}