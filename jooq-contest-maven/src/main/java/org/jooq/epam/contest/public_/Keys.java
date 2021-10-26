/*
 * This file is generated by jOOQ.
 */
package org.jooq.epam.contest.public_;


import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.epam.contest.public_.tables.Description;
import org.jooq.epam.contest.public_.tables.Product;
import org.jooq.epam.contest.public_.tables.records.DescriptionRecord;
import org.jooq.epam.contest.public_.tables.records.ProductRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in
 * public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<DescriptionRecord> DESCRIPTION_PKEY = Internal.createUniqueKey(Description.DESCRIPTION, DSL.name("description_pkey"), new TableField[] { Description.DESCRIPTION.ID }, true);
    public static final UniqueKey<ProductRecord> PRODUCT_PKEY = Internal.createUniqueKey(Product.PRODUCT, DSL.name("product_pkey"), new TableField[] { Product.PRODUCT.ID }, true);
}
