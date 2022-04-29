// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Database;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AutonomousContainerDatabaseDataguardAssociationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutonomousContainerDatabaseDataguardAssociationArgs Empty = new AutonomousContainerDatabaseDataguardAssociationArgs();

    /**
     * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseDataguardAssociationId", required=true)
    private Output<String> autonomousContainerDatabaseDataguardAssociationId;

    /**
     * @return The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> autonomousContainerDatabaseDataguardAssociationId() {
        return this.autonomousContainerDatabaseDataguardAssociationId;
    }

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    @Import(name="autonomousContainerDatabaseId", required=true)
    private Output<String> autonomousContainerDatabaseId;

    /**
     * @return The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * 
     */
    public Output<String> autonomousContainerDatabaseId() {
        return this.autonomousContainerDatabaseId;
    }

    /**
     * (Updatable) Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    @Import(name="isAutomaticFailoverEnabled")
    private @Nullable Output<Boolean> isAutomaticFailoverEnabled;

    /**
     * @return (Updatable) Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
     * 
     */
    public Optional<Output<Boolean>> isAutomaticFailoverEnabled() {
        return Optional.ofNullable(this.isAutomaticFailoverEnabled);
    }

    private AutonomousContainerDatabaseDataguardAssociationArgs() {}

    private AutonomousContainerDatabaseDataguardAssociationArgs(AutonomousContainerDatabaseDataguardAssociationArgs $) {
        this.autonomousContainerDatabaseDataguardAssociationId = $.autonomousContainerDatabaseDataguardAssociationId;
        this.autonomousContainerDatabaseId = $.autonomousContainerDatabaseId;
        this.isAutomaticFailoverEnabled = $.isAutomaticFailoverEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutonomousContainerDatabaseDataguardAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutonomousContainerDatabaseDataguardAssociationArgs $;

        public Builder() {
            $ = new AutonomousContainerDatabaseDataguardAssociationArgs();
        }

        public Builder(AutonomousContainerDatabaseDataguardAssociationArgs defaults) {
            $ = new AutonomousContainerDatabaseDataguardAssociationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autonomousContainerDatabaseDataguardAssociationId The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseDataguardAssociationId(Output<String> autonomousContainerDatabaseDataguardAssociationId) {
            $.autonomousContainerDatabaseDataguardAssociationId = autonomousContainerDatabaseDataguardAssociationId;
            return this;
        }

        /**
         * @param autonomousContainerDatabaseDataguardAssociationId The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseDataguardAssociationId(String autonomousContainerDatabaseDataguardAssociationId) {
            return autonomousContainerDatabaseDataguardAssociationId(Output.of(autonomousContainerDatabaseDataguardAssociationId));
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(Output<String> autonomousContainerDatabaseId) {
            $.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /**
         * @param autonomousContainerDatabaseId The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * 
         * @return builder
         * 
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            return autonomousContainerDatabaseId(Output.of(autonomousContainerDatabaseId));
        }

        /**
         * @param isAutomaticFailoverEnabled (Updatable) Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         * 
         * @return builder
         * 
         */
        public Builder isAutomaticFailoverEnabled(@Nullable Output<Boolean> isAutomaticFailoverEnabled) {
            $.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            return this;
        }

        /**
         * @param isAutomaticFailoverEnabled (Updatable) Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard Association
         * 
         * @return builder
         * 
         */
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            return isAutomaticFailoverEnabled(Output.of(isAutomaticFailoverEnabled));
        }

        public AutonomousContainerDatabaseDataguardAssociationArgs build() {
            $.autonomousContainerDatabaseDataguardAssociationId = Objects.requireNonNull($.autonomousContainerDatabaseDataguardAssociationId, "expected parameter 'autonomousContainerDatabaseDataguardAssociationId' to be non-null");
            $.autonomousContainerDatabaseId = Objects.requireNonNull($.autonomousContainerDatabaseId, "expected parameter 'autonomousContainerDatabaseId' to be non-null");
            return $;
        }
    }

}
