package net.langenmaier.schafkopf.models;

/*
 * #%L
 * schafkopf
 * %%
 * Copyright (C) 2015 langenmaier.net
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import java.util.List;
import java.util.Map;

import net.langenmaier.schafkopf.enums.Suits;

public abstract class Game {
	Player player;
	GameAnnouncement announcement;
	
	//Cards are in order
	List<Card> trumpCards;
	Map<Suits,List<Card>> colorCards;
	
	protected Game() {
		initializeCardOrder();
	}
	
	protected abstract void initializeCardOrder();

}
