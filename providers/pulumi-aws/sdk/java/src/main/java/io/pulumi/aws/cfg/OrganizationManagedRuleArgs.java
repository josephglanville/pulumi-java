// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationManagedRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationManagedRuleArgs Empty = new OrganizationManagedRuleArgs();

    /**
     * Description of the rule
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * List of AWS account identifiers to exclude from the rule
     * 
     */
    @Import(name="excludedAccounts")
      private final @Nullable Output<List<String>> excludedAccounts;

    public Output<List<String>> getExcludedAccounts() {
        return this.excludedAccounts == null ? Output.empty() : this.excludedAccounts;
    }

    /**
     * A string in JSON format that is passed to the AWS Config Rule Lambda Function
     * 
     */
    @Import(name="inputParameters")
      private final @Nullable Output<String> inputParameters;

    public Output<String> getInputParameters() {
        return this.inputParameters == null ? Output.empty() : this.inputParameters;
    }

    /**
     * The maximum frequency with which AWS Config runs evaluations for a rule, if the rule is triggered at a periodic frequency. Defaults to `TwentyFour_Hours` for periodic frequency triggered rules. Valid values: `One_Hour`, `Three_Hours`, `Six_Hours`, `Twelve_Hours`, or `TwentyFour_Hours`.
     * 
     */
    @Import(name="maximumExecutionFrequency")
      private final @Nullable Output<String> maximumExecutionFrequency;

    public Output<String> getMaximumExecutionFrequency() {
        return this.maximumExecutionFrequency == null ? Output.empty() : this.maximumExecutionFrequency;
    }

    /**
     * The name of the rule
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Identifier of the AWS resource to evaluate
     * 
     */
    @Import(name="resourceIdScope")
      private final @Nullable Output<String> resourceIdScope;

    public Output<String> getResourceIdScope() {
        return this.resourceIdScope == null ? Output.empty() : this.resourceIdScope;
    }

    /**
     * List of types of AWS resources to evaluate
     * 
     */
    @Import(name="resourceTypesScopes")
      private final @Nullable Output<List<String>> resourceTypesScopes;

    public Output<List<String>> getResourceTypesScopes() {
        return this.resourceTypesScopes == null ? Output.empty() : this.resourceTypesScopes;
    }

    /**
     * Identifier of an available AWS Config Managed Rule to call. For available values, see the [List of AWS Config Managed Rules](https://docs.aws.amazon.com/config/latest/developerguide/managed-rules-by-aws-config.html) documentation
     * 
     */
    @Import(name="ruleIdentifier", required=true)
      private final Output<String> ruleIdentifier;

    public Output<String> getRuleIdentifier() {
        return this.ruleIdentifier;
    }

    /**
     * Tag key of AWS resources to evaluate
     * 
     */
    @Import(name="tagKeyScope")
      private final @Nullable Output<String> tagKeyScope;

    public Output<String> getTagKeyScope() {
        return this.tagKeyScope == null ? Output.empty() : this.tagKeyScope;
    }

    /**
     * Tag value of AWS resources to evaluate
     * 
     */
    @Import(name="tagValueScope")
      private final @Nullable Output<String> tagValueScope;

    public Output<String> getTagValueScope() {
        return this.tagValueScope == null ? Output.empty() : this.tagValueScope;
    }

    public OrganizationManagedRuleArgs(
        @Nullable Output<String> description,
        @Nullable Output<List<String>> excludedAccounts,
        @Nullable Output<String> inputParameters,
        @Nullable Output<String> maximumExecutionFrequency,
        @Nullable Output<String> name,
        @Nullable Output<String> resourceIdScope,
        @Nullable Output<List<String>> resourceTypesScopes,
        Output<String> ruleIdentifier,
        @Nullable Output<String> tagKeyScope,
        @Nullable Output<String> tagValueScope) {
        this.description = description;
        this.excludedAccounts = excludedAccounts;
        this.inputParameters = inputParameters;
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        this.name = name;
        this.resourceIdScope = resourceIdScope;
        this.resourceTypesScopes = resourceTypesScopes;
        this.ruleIdentifier = Objects.requireNonNull(ruleIdentifier, "expected parameter 'ruleIdentifier' to be non-null");
        this.tagKeyScope = tagKeyScope;
        this.tagValueScope = tagValueScope;
    }

    private OrganizationManagedRuleArgs() {
        this.description = Output.empty();
        this.excludedAccounts = Output.empty();
        this.inputParameters = Output.empty();
        this.maximumExecutionFrequency = Output.empty();
        this.name = Output.empty();
        this.resourceIdScope = Output.empty();
        this.resourceTypesScopes = Output.empty();
        this.ruleIdentifier = Output.empty();
        this.tagKeyScope = Output.empty();
        this.tagValueScope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationManagedRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> excludedAccounts;
        private @Nullable Output<String> inputParameters;
        private @Nullable Output<String> maximumExecutionFrequency;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resourceIdScope;
        private @Nullable Output<List<String>> resourceTypesScopes;
        private Output<String> ruleIdentifier;
        private @Nullable Output<String> tagKeyScope;
        private @Nullable Output<String> tagValueScope;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationManagedRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.excludedAccounts = defaults.excludedAccounts;
    	      this.inputParameters = defaults.inputParameters;
    	      this.maximumExecutionFrequency = defaults.maximumExecutionFrequency;
    	      this.name = defaults.name;
    	      this.resourceIdScope = defaults.resourceIdScope;
    	      this.resourceTypesScopes = defaults.resourceTypesScopes;
    	      this.ruleIdentifier = defaults.ruleIdentifier;
    	      this.tagKeyScope = defaults.tagKeyScope;
    	      this.tagValueScope = defaults.tagValueScope;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder excludedAccounts(@Nullable Output<List<String>> excludedAccounts) {
            this.excludedAccounts = excludedAccounts;
            return this;
        }
        public Builder excludedAccounts(@Nullable List<String> excludedAccounts) {
            this.excludedAccounts = Output.ofNullable(excludedAccounts);
            return this;
        }
        public Builder excludedAccounts(String... excludedAccounts) {
            return excludedAccounts(List.of(excludedAccounts));
        }
        public Builder inputParameters(@Nullable Output<String> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public Builder inputParameters(@Nullable String inputParameters) {
            this.inputParameters = Output.ofNullable(inputParameters);
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable Output<String> maximumExecutionFrequency) {
            this.maximumExecutionFrequency = maximumExecutionFrequency;
            return this;
        }
        public Builder maximumExecutionFrequency(@Nullable String maximumExecutionFrequency) {
            this.maximumExecutionFrequency = Output.ofNullable(maximumExecutionFrequency);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder resourceIdScope(@Nullable Output<String> resourceIdScope) {
            this.resourceIdScope = resourceIdScope;
            return this;
        }
        public Builder resourceIdScope(@Nullable String resourceIdScope) {
            this.resourceIdScope = Output.ofNullable(resourceIdScope);
            return this;
        }
        public Builder resourceTypesScopes(@Nullable Output<List<String>> resourceTypesScopes) {
            this.resourceTypesScopes = resourceTypesScopes;
            return this;
        }
        public Builder resourceTypesScopes(@Nullable List<String> resourceTypesScopes) {
            this.resourceTypesScopes = Output.ofNullable(resourceTypesScopes);
            return this;
        }
        public Builder resourceTypesScopes(String... resourceTypesScopes) {
            return resourceTypesScopes(List.of(resourceTypesScopes));
        }
        public Builder ruleIdentifier(Output<String> ruleIdentifier) {
            this.ruleIdentifier = Objects.requireNonNull(ruleIdentifier);
            return this;
        }
        public Builder ruleIdentifier(String ruleIdentifier) {
            this.ruleIdentifier = Output.of(Objects.requireNonNull(ruleIdentifier));
            return this;
        }
        public Builder tagKeyScope(@Nullable Output<String> tagKeyScope) {
            this.tagKeyScope = tagKeyScope;
            return this;
        }
        public Builder tagKeyScope(@Nullable String tagKeyScope) {
            this.tagKeyScope = Output.ofNullable(tagKeyScope);
            return this;
        }
        public Builder tagValueScope(@Nullable Output<String> tagValueScope) {
            this.tagValueScope = tagValueScope;
            return this;
        }
        public Builder tagValueScope(@Nullable String tagValueScope) {
            this.tagValueScope = Output.ofNullable(tagValueScope);
            return this;
        }        public OrganizationManagedRuleArgs build() {
            return new OrganizationManagedRuleArgs(description, excludedAccounts, inputParameters, maximumExecutionFrequency, name, resourceIdScope, resourceTypesScopes, ruleIdentifier, tagKeyScope, tagValueScope);
        }
    }
}