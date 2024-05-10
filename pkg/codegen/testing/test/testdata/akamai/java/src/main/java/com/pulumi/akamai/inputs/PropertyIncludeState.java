// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyIncludeState extends com.pulumi.resources.ResourceArgs {

    public static final PropertyIncludeState Empty = new PropertyIncludeState();

    /**
     * Identifies the contract to which the include is assigned
     * 
     */
    @Import(name="contractId")
    private @Nullable Output<String> contractId;

    /**
     * @return Identifies the contract to which the include is assigned
     * 
     */
    public Optional<Output<String>> contractId() {
        return Optional.ofNullable(this.contractId);
    }

    /**
     * Identifies the group to which the include is assigned
     * 
     */
    @Import(name="groupId")
    private @Nullable Output<String> groupId;

    /**
     * @return Identifies the group to which the include is assigned
     * 
     */
    public Optional<Output<String>> groupId() {
        return Optional.ofNullable(this.groupId);
    }

    /**
     * Specifies the most recent version of the include
     * 
     */
    @Import(name="latestVersion")
    private @Nullable Output<Integer> latestVersion;

    /**
     * @return Specifies the most recent version of the include
     * 
     */
    public Optional<Output<Integer>> latestVersion() {
        return Optional.ofNullable(this.latestVersion);
    }

    /**
     * A descriptive name for the include
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A descriptive name for the include
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The product assigned to the include
     * 
     */
    @Import(name="productId")
    private @Nullable Output<String> productId;

    /**
     * @return The product assigned to the include
     * 
     */
    public Optional<Output<String>> productId() {
        return Optional.ofNullable(this.productId);
    }

    /**
     * The most recent version to be activated to the production network
     * 
     */
    @Import(name="productionVersion")
    private @Nullable Output<String> productionVersion;

    /**
     * @return The most recent version to be activated to the production network
     * 
     */
    public Optional<Output<String>> productionVersion() {
        return Optional.ofNullable(this.productionVersion);
    }

    /**
     * Rule validation errors
     * 
     */
    @Import(name="ruleErrors")
    private @Nullable Output<String> ruleErrors;

    /**
     * @return Rule validation errors
     * 
     */
    public Optional<Output<String>> ruleErrors() {
        return Optional.ofNullable(this.ruleErrors);
    }

    /**
     * Indicates the versioned set of features and criteria
     * 
     */
    @Import(name="ruleFormat")
    private @Nullable Output<String> ruleFormat;

    /**
     * @return Indicates the versioned set of features and criteria
     * 
     */
    public Optional<Output<String>> ruleFormat() {
        return Optional.ofNullable(this.ruleFormat);
    }

    /**
     * Rule validation warnings
     * 
     */
    @Import(name="ruleWarnings")
    private @Nullable Output<String> ruleWarnings;

    /**
     * @return Rule validation warnings
     * 
     */
    public Optional<Output<String>> ruleWarnings() {
        return Optional.ofNullable(this.ruleWarnings);
    }

    /**
     * Property Rules as JSON
     * 
     */
    @Import(name="rules")
    private @Nullable Output<String> rules;

    /**
     * @return Property Rules as JSON
     * 
     */
    public Optional<Output<String>> rules() {
        return Optional.ofNullable(this.rules);
    }

    /**
     * The most recent version to be activated to the staging network
     * 
     */
    @Import(name="stagingVersion")
    private @Nullable Output<String> stagingVersion;

    /**
     * @return The most recent version to be activated to the staging network
     * 
     */
    public Optional<Output<String>> stagingVersion() {
        return Optional.ofNullable(this.stagingVersion);
    }

    /**
     * Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private PropertyIncludeState() {}

    private PropertyIncludeState(PropertyIncludeState $) {
        this.contractId = $.contractId;
        this.groupId = $.groupId;
        this.latestVersion = $.latestVersion;
        this.name = $.name;
        this.productId = $.productId;
        this.productionVersion = $.productionVersion;
        this.ruleErrors = $.ruleErrors;
        this.ruleFormat = $.ruleFormat;
        this.ruleWarnings = $.ruleWarnings;
        this.rules = $.rules;
        this.stagingVersion = $.stagingVersion;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyIncludeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyIncludeState $;

        public Builder() {
            $ = new PropertyIncludeState();
        }

        public Builder(PropertyIncludeState defaults) {
            $ = new PropertyIncludeState(Objects.requireNonNull(defaults));
        }

        /**
         * @param contractId Identifies the contract to which the include is assigned
         * 
         * @return builder
         * 
         */
        public Builder contractId(@Nullable Output<String> contractId) {
            $.contractId = contractId;
            return this;
        }

        /**
         * @param contractId Identifies the contract to which the include is assigned
         * 
         * @return builder
         * 
         */
        public Builder contractId(String contractId) {
            return contractId(Output.of(contractId));
        }

        /**
         * @param groupId Identifies the group to which the include is assigned
         * 
         * @return builder
         * 
         */
        public Builder groupId(@Nullable Output<String> groupId) {
            $.groupId = groupId;
            return this;
        }

        /**
         * @param groupId Identifies the group to which the include is assigned
         * 
         * @return builder
         * 
         */
        public Builder groupId(String groupId) {
            return groupId(Output.of(groupId));
        }

        /**
         * @param latestVersion Specifies the most recent version of the include
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(@Nullable Output<Integer> latestVersion) {
            $.latestVersion = latestVersion;
            return this;
        }

        /**
         * @param latestVersion Specifies the most recent version of the include
         * 
         * @return builder
         * 
         */
        public Builder latestVersion(Integer latestVersion) {
            return latestVersion(Output.of(latestVersion));
        }

        /**
         * @param name A descriptive name for the include
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A descriptive name for the include
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param productId The product assigned to the include
         * 
         * @return builder
         * 
         */
        public Builder productId(@Nullable Output<String> productId) {
            $.productId = productId;
            return this;
        }

        /**
         * @param productId The product assigned to the include
         * 
         * @return builder
         * 
         */
        public Builder productId(String productId) {
            return productId(Output.of(productId));
        }

        /**
         * @param productionVersion The most recent version to be activated to the production network
         * 
         * @return builder
         * 
         */
        public Builder productionVersion(@Nullable Output<String> productionVersion) {
            $.productionVersion = productionVersion;
            return this;
        }

        /**
         * @param productionVersion The most recent version to be activated to the production network
         * 
         * @return builder
         * 
         */
        public Builder productionVersion(String productionVersion) {
            return productionVersion(Output.of(productionVersion));
        }

        /**
         * @param ruleErrors Rule validation errors
         * 
         * @return builder
         * 
         */
        public Builder ruleErrors(@Nullable Output<String> ruleErrors) {
            $.ruleErrors = ruleErrors;
            return this;
        }

        /**
         * @param ruleErrors Rule validation errors
         * 
         * @return builder
         * 
         */
        public Builder ruleErrors(String ruleErrors) {
            return ruleErrors(Output.of(ruleErrors));
        }

        /**
         * @param ruleFormat Indicates the versioned set of features and criteria
         * 
         * @return builder
         * 
         */
        public Builder ruleFormat(@Nullable Output<String> ruleFormat) {
            $.ruleFormat = ruleFormat;
            return this;
        }

        /**
         * @param ruleFormat Indicates the versioned set of features and criteria
         * 
         * @return builder
         * 
         */
        public Builder ruleFormat(String ruleFormat) {
            return ruleFormat(Output.of(ruleFormat));
        }

        /**
         * @param ruleWarnings Rule validation warnings
         * 
         * @return builder
         * 
         */
        public Builder ruleWarnings(@Nullable Output<String> ruleWarnings) {
            $.ruleWarnings = ruleWarnings;
            return this;
        }

        /**
         * @param ruleWarnings Rule validation warnings
         * 
         * @return builder
         * 
         */
        public Builder ruleWarnings(String ruleWarnings) {
            return ruleWarnings(Output.of(ruleWarnings));
        }

        /**
         * @param rules Property Rules as JSON
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<String> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules Property Rules as JSON
         * 
         * @return builder
         * 
         */
        public Builder rules(String rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param stagingVersion The most recent version to be activated to the staging network
         * 
         * @return builder
         * 
         */
        public Builder stagingVersion(@Nullable Output<String> stagingVersion) {
            $.stagingVersion = stagingVersion;
            return this;
        }

        /**
         * @param stagingVersion The most recent version to be activated to the staging network
         * 
         * @return builder
         * 
         */
        public Builder stagingVersion(String stagingVersion) {
            return stagingVersion(Output.of(stagingVersion));
        }

        /**
         * @param type Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Specifies the type of the include, either &#39;MICROSERVICES&#39; or &#39;COMMON_SETTINGS&#39;
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public PropertyIncludeState build() {
            return $;
        }
    }

}
