/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.business.planner.entities.consolidations;

import java.math.BigDecimal;

import org.joda.time.LocalDate;
import org.navalplanner.business.advance.entities.AdvanceMeasurement;

/**
 * @author Susana Montes Pedreira <smontes@wirelessgalicia.com>
 */

public class NonCalculatedConsolidatedValue extends ConsolidatedValue {

    private NonCalculatedConsolidation consolidation;

    private AdvanceMeasurement advanceMeasurement;

    public static NonCalculatedConsolidatedValue create() {
        return create(new NonCalculatedConsolidatedValue());
    }

    public static NonCalculatedConsolidatedValue create(LocalDate date,
            BigDecimal value) {
        return create(new NonCalculatedConsolidatedValue(date, value));
    }

    public static NonCalculatedConsolidatedValue create(LocalDate date,
            BigDecimal value, AdvanceMeasurement advanceMeasurement) {
        return create(new NonCalculatedConsolidatedValue(date, value,
                advanceMeasurement));
    }

    protected NonCalculatedConsolidatedValue(LocalDate date, BigDecimal value,
            AdvanceMeasurement advanceMeasurement) {
        this(date, value);
        this.advanceMeasurement = advanceMeasurement;
    }

    protected NonCalculatedConsolidatedValue(LocalDate date, BigDecimal value) {
        super(date, value);
    }

    protected NonCalculatedConsolidatedValue() {
    }

    public void setAdvanceMeasurement(AdvanceMeasurement advanceMeasurement) {
        this.advanceMeasurement = advanceMeasurement;
    }

    public AdvanceMeasurement getAdvanceMeasurement() {
        return advanceMeasurement;
    }

    public void setConsolidation(NonCalculatedConsolidation consolidation) {
        this.consolidation = consolidation;
    }

    public NonCalculatedConsolidation getConsolidation() {
        return consolidation;
    }

    @Override
    public boolean isCalculated() {
        return false;
    }
}
