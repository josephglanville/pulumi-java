// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab;

import io.pulumi.azurenative.devtestlab.enums.PolicyEvaluatorType;
import io.pulumi.azurenative.devtestlab.enums.PolicyFactName;
import io.pulumi.azurenative.devtestlab.enums.PolicyStatus;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyArgs Empty = new PolicyArgs();

    /**
     * The description of the policy.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The evaluator type of the policy (i.e. AllowedValuesPolicy, MaxValuePolicy).
     * 
     */
    @InputImport(name="evaluatorType")
      private final @Nullable Input<Either<String,PolicyEvaluatorType>> evaluatorType;

    public Input<Either<String,PolicyEvaluatorType>> getEvaluatorType() {
        return this.evaluatorType == null ? Input.empty() : this.evaluatorType;
    }

    /**
     * The fact data of the policy.
     * 
     */
    @InputImport(name="factData")
      private final @Nullable Input<String> factData;

    public Input<String> getFactData() {
        return this.factData == null ? Input.empty() : this.factData;
    }

    /**
     * The fact name of the policy (e.g. LabVmCount, LabVmSize, MaxVmsAllowedPerLab, etc.
     * 
     */
    @InputImport(name="factName")
      private final @Nullable Input<Either<String,PolicyFactName>> factName;

    public Input<Either<String,PolicyFactName>> getFactName() {
        return this.factName == null ? Input.empty() : this.factName;
    }

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
      private final Input<String> labName;

    public Input<String> getLabName() {
        return this.labName;
    }

    /**
     * The location of the resource.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the policy.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The name of the policy set.
     * 
     */
    @InputImport(name="policySetName", required=true)
      private final Input<String> policySetName;

    public Input<String> getPolicySetName() {
        return this.policySetName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The status of the policy.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<Either<String,PolicyStatus>> status;

    public Input<Either<String,PolicyStatus>> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * The tags of the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The threshold of the policy (i.e. a number for MaxValuePolicy, and a JSON array of values for AllowedValuesPolicy).
     * 
     */
    @InputImport(name="threshold")
      private final @Nullable Input<String> threshold;

    public Input<String> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public PolicyArgs(
        @Nullable Input<String> description,
        @Nullable Input<Either<String,PolicyEvaluatorType>> evaluatorType,
        @Nullable Input<String> factData,
        @Nullable Input<Either<String,PolicyFactName>> factName,
        Input<String> labName,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<String> policySetName,
        Input<String> resourceGroupName,
        @Nullable Input<Either<String,PolicyStatus>> status,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> threshold) {
        this.description = description;
        this.evaluatorType = evaluatorType;
        this.factData = factData;
        this.factName = factName;
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.location = location;
        this.name = name;
        this.policySetName = Objects.requireNonNull(policySetName, "expected parameter 'policySetName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.status = status;
        this.tags = tags;
        this.threshold = threshold;
    }

    private PolicyArgs() {
        this.description = Input.empty();
        this.evaluatorType = Input.empty();
        this.factData = Input.empty();
        this.factName = Input.empty();
        this.labName = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.policySetName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.status = Input.empty();
        this.tags = Input.empty();
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Either<String,PolicyEvaluatorType>> evaluatorType;
        private @Nullable Input<String> factData;
        private @Nullable Input<Either<String,PolicyFactName>> factName;
        private Input<String> labName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<String> policySetName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Either<String,PolicyStatus>> status;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.evaluatorType = defaults.evaluatorType;
    	      this.factData = defaults.factData;
    	      this.factName = defaults.factName;
    	      this.labName = defaults.labName;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.policySetName = defaults.policySetName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.threshold = defaults.threshold;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEvaluatorType(@Nullable Input<Either<String,PolicyEvaluatorType>> evaluatorType) {
            this.evaluatorType = evaluatorType;
            return this;
        }

        public Builder setEvaluatorType(@Nullable Either<String,PolicyEvaluatorType> evaluatorType) {
            this.evaluatorType = Input.ofNullable(evaluatorType);
            return this;
        }

        public Builder setFactData(@Nullable Input<String> factData) {
            this.factData = factData;
            return this;
        }

        public Builder setFactData(@Nullable String factData) {
            this.factData = Input.ofNullable(factData);
            return this;
        }

        public Builder setFactName(@Nullable Input<Either<String,PolicyFactName>> factName) {
            this.factName = factName;
            return this;
        }

        public Builder setFactName(@Nullable Either<String,PolicyFactName> factName) {
            this.factName = Input.ofNullable(factName);
            return this;
        }

        public Builder setLabName(Input<String> labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder setLabName(String labName) {
            this.labName = Input.of(Objects.requireNonNull(labName));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPolicySetName(Input<String> policySetName) {
            this.policySetName = Objects.requireNonNull(policySetName);
            return this;
        }

        public Builder setPolicySetName(String policySetName) {
            this.policySetName = Input.of(Objects.requireNonNull(policySetName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setStatus(@Nullable Input<Either<String,PolicyStatus>> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable Either<String,PolicyStatus> status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setThreshold(@Nullable Input<String> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable String threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }
        public PolicyArgs build() {
            return new PolicyArgs(description, evaluatorType, factData, factName, labName, location, name, policySetName, resourceGroupName, status, tags, threshold);
        }
    }
}
