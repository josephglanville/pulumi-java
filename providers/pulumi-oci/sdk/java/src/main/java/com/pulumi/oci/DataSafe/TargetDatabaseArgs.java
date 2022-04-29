// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.DataSafe.inputs.TargetDatabaseConnectionOptionArgs;
import com.pulumi.oci.DataSafe.inputs.TargetDatabaseCredentialsArgs;
import com.pulumi.oci.DataSafe.inputs.TargetDatabaseDatabaseDetailsArgs;
import com.pulumi.oci.DataSafe.inputs.TargetDatabaseTlsConfigArgs;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetDatabaseArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetDatabaseArgs Empty = new TargetDatabaseArgs();

    /**
     * (Updatable) The OCID of the compartment in which to create the Data Safe target database.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the compartment in which to create the Data Safe target database.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    /**
     * (Updatable) Types of connection supported by Data Safe.
     * 
     */
    @Import(name="connectionOption")
    private @Nullable Output<TargetDatabaseConnectionOptionArgs> connectionOption;

    /**
     * @return (Updatable) Types of connection supported by Data Safe.
     * 
     */
    public Optional<Output<TargetDatabaseConnectionOptionArgs>> connectionOption() {
        return Optional.ofNullable(this.connectionOption);
    }

    /**
     * (Updatable) The database credentials required for Data Safe to connect to the database.
     * 
     */
    @Import(name="credentials")
    private @Nullable Output<TargetDatabaseCredentialsArgs> credentials;

    /**
     * @return (Updatable) The database credentials required for Data Safe to connect to the database.
     * 
     */
    public Optional<Output<TargetDatabaseCredentialsArgs>> credentials() {
        return Optional.ofNullable(this.credentials);
    }

    /**
     * (Updatable) Details of the database for the registration in Data Safe. To choose applicable database type and infrastructure type refer to  https://confluence.oci.oraclecorp.com/display/DATASAFE/Target+V2+Design
     * 
     */
    @Import(name="databaseDetails", required=true)
    private Output<TargetDatabaseDatabaseDetailsArgs> databaseDetails;

    /**
     * @return (Updatable) Details of the database for the registration in Data Safe. To choose applicable database type and infrastructure type refer to  https://confluence.oci.oraclecorp.com/display/DATASAFE/Target+V2+Design
     * 
     */
    public Output<TargetDatabaseDatabaseDetailsArgs> databaseDetails() {
        return this.databaseDetails;
    }

    /**
     * (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    @Import(name="definedTags")
    private @Nullable Output<Map<String,Object>> definedTags;

    /**
     * @return (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> definedTags() {
        return Optional.ofNullable(this.definedTags);
    }

    /**
     * (Updatable) The description of the target database in Data Safe.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return (Updatable) The description of the target database in Data Safe.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * (Updatable) The display name of the target database in Data Safe. The name is modifiable and does not need to be unique.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return (Updatable) The display name of the target database in Data Safe. The name is modifiable and does not need to be unique.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    @Import(name="freeformTags")
    private @Nullable Output<Map<String,Object>> freeformTags;

    /**
     * @return (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Optional<Output<Map<String,Object>>> freeformTags() {
        return Optional.ofNullable(this.freeformTags);
    }

    /**
     * (Updatable) The details required to establish a TLS enabled connection.
     * 
     */
    @Import(name="tlsConfig")
    private @Nullable Output<TargetDatabaseTlsConfigArgs> tlsConfig;

    /**
     * @return (Updatable) The details required to establish a TLS enabled connection.
     * 
     */
    public Optional<Output<TargetDatabaseTlsConfigArgs>> tlsConfig() {
        return Optional.ofNullable(this.tlsConfig);
    }

    private TargetDatabaseArgs() {}

    private TargetDatabaseArgs(TargetDatabaseArgs $) {
        this.compartmentId = $.compartmentId;
        this.connectionOption = $.connectionOption;
        this.credentials = $.credentials;
        this.databaseDetails = $.databaseDetails;
        this.definedTags = $.definedTags;
        this.description = $.description;
        this.displayName = $.displayName;
        this.freeformTags = $.freeformTags;
        this.tlsConfig = $.tlsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetDatabaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetDatabaseArgs $;

        public Builder() {
            $ = new TargetDatabaseArgs();
        }

        public Builder(TargetDatabaseArgs defaults) {
            $ = new TargetDatabaseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment in which to create the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the compartment in which to create the Data Safe target database.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param connectionOption (Updatable) Types of connection supported by Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder connectionOption(@Nullable Output<TargetDatabaseConnectionOptionArgs> connectionOption) {
            $.connectionOption = connectionOption;
            return this;
        }

        /**
         * @param connectionOption (Updatable) Types of connection supported by Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder connectionOption(TargetDatabaseConnectionOptionArgs connectionOption) {
            return connectionOption(Output.of(connectionOption));
        }

        /**
         * @param credentials (Updatable) The database credentials required for Data Safe to connect to the database.
         * 
         * @return builder
         * 
         */
        public Builder credentials(@Nullable Output<TargetDatabaseCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials (Updatable) The database credentials required for Data Safe to connect to the database.
         * 
         * @return builder
         * 
         */
        public Builder credentials(TargetDatabaseCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param databaseDetails (Updatable) Details of the database for the registration in Data Safe. To choose applicable database type and infrastructure type refer to  https://confluence.oci.oraclecorp.com/display/DATASAFE/Target+V2+Design
         * 
         * @return builder
         * 
         */
        public Builder databaseDetails(Output<TargetDatabaseDatabaseDetailsArgs> databaseDetails) {
            $.databaseDetails = databaseDetails;
            return this;
        }

        /**
         * @param databaseDetails (Updatable) Details of the database for the registration in Data Safe. To choose applicable database type and infrastructure type refer to  https://confluence.oci.oraclecorp.com/display/DATASAFE/Target+V2+Design
         * 
         * @return builder
         * 
         */
        public Builder databaseDetails(TargetDatabaseDatabaseDetailsArgs databaseDetails) {
            return databaseDetails(Output.of(databaseDetails));
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(@Nullable Output<Map<String,Object>> definedTags) {
            $.definedTags = definedTags;
            return this;
        }

        /**
         * @param definedTags (Updatable) Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder definedTags(Map<String,Object> definedTags) {
            return definedTags(Output.of(definedTags));
        }

        /**
         * @param description (Updatable) The description of the target database in Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description (Updatable) The description of the target database in Data Safe.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName (Updatable) The display name of the target database in Data Safe. The name is modifiable and does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName (Updatable) The display name of the target database in Data Safe. The name is modifiable and does not need to be unique.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(@Nullable Output<Map<String,Object>> freeformTags) {
            $.freeformTags = freeformTags;
            return this;
        }

        /**
         * @param freeformTags (Updatable) Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
         * 
         * @return builder
         * 
         */
        public Builder freeformTags(Map<String,Object> freeformTags) {
            return freeformTags(Output.of(freeformTags));
        }

        /**
         * @param tlsConfig (Updatable) The details required to establish a TLS enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder tlsConfig(@Nullable Output<TargetDatabaseTlsConfigArgs> tlsConfig) {
            $.tlsConfig = tlsConfig;
            return this;
        }

        /**
         * @param tlsConfig (Updatable) The details required to establish a TLS enabled connection.
         * 
         * @return builder
         * 
         */
        public Builder tlsConfig(TargetDatabaseTlsConfigArgs tlsConfig) {
            return tlsConfig(Output.of(tlsConfig));
        }

        public TargetDatabaseArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            $.databaseDetails = Objects.requireNonNull($.databaseDetails, "expected parameter 'databaseDetails' to be non-null");
            return $;
        }
    }

}
