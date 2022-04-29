// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAutonomousContainerDatabaseDataguardAssociationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutonomousContainerDatabaseDataguardAssociationArgs Empty = new GetAutonomousContainerDatabaseDataguardAssociationArgs();

    /**
     * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseDataguardAssociationId", required=true)
    private String autonomousContainerDatabaseDataguardAssociationId;

    /**
     * @return The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String autonomousContainerDatabaseDataguardAssociationId() {
        return this.autonomousContainerDatabaseDataguardAssociationId;
    }

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseId", required=true)
    private String autonomousContainerDatabaseId;

    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public String autonomousContainerDatabaseId() {
        return this.autonomousContainerDatabaseId;
    }

    private GetAutonomousContainerDatabaseDataguardAssociationArgs() {}

    private GetAutonomousContainerDatabaseDataguardAssociationArgs(GetAutonomousContainerDatabaseDataguardAssociationArgs $) {
        this.autonomousContainerDatabaseDataguardAssociationId = $.autonomousContainerDatabaseDataguardAssociationId;
        this.autonomousContainerDatabaseId = $.autonomousContainerDatabaseId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutonomousContainerDatabaseDataguardAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutonomousContainerDatabaseDataguardAssociationArgs $;

        public Builder() {
            $ = new GetAutonomousContainerDatabaseDataguardAssociationArgs();
        }

        public Builder(GetAutonomousContainerDatabaseDataguardAssociationArgs defaults) {
            $ = new GetAutonomousContainerDatabaseDataguardAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousContainerDatabaseDataguardAssociationId The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseDataguardAssociationId(String autonomousContainerDatabaseDataguardAssociationId) {
            $.autonomousContainerDatabaseDataguardAssociationId = autonomousContainerDatabaseDataguardAssociationId;
            return this;
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            $.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        public GetAutonomousContainerDatabaseDataguardAssociationArgs build() {
            $.autonomousContainerDatabaseDataguardAssociationId = Objects.requireNonNull($.autonomousContainerDatabaseDataguardAssociationId, "expected parameter 'autonomousContainerDatabaseDataguardAssociationId' to be non-null");
            $.autonomousContainerDatabaseId = Objects.requireNonNull($.autonomousContainerDatabaseId, "expected parameter 'autonomousContainerDatabaseId' to be non-null");
            return $;
        }
    }

}
