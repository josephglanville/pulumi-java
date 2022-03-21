// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.ObjectReplicationPolicyFilterResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The replication policy rule between two containers.
 * 
 */
public final class ObjectReplicationPolicyRuleResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectReplicationPolicyRuleResponse Empty = new ObjectReplicationPolicyRuleResponse();

    /**
     * Required. Destination container name.
     * 
     */
    @Import(name="destinationContainer", required=true)
      private final String destinationContainer;

    public String getDestinationContainer() {
        return this.destinationContainer;
    }

    /**
     * Optional. An object that defines the filter set.
     * 
     */
    @Import(name="filters")
      private final @Nullable ObjectReplicationPolicyFilterResponse filters;

    public Optional<ObjectReplicationPolicyFilterResponse> getFilters() {
        return this.filters == null ? Optional.empty() : Optional.ofNullable(this.filters);
    }

    /**
     * Rule Id is auto-generated for each new rule on destination account. It is required for put policy on source account.
     * 
     */
    @Import(name="ruleId")
      private final @Nullable String ruleId;

    public Optional<String> getRuleId() {
        return this.ruleId == null ? Optional.empty() : Optional.ofNullable(this.ruleId);
    }

    /**
     * Required. Source container name.
     * 
     */
    @Import(name="sourceContainer", required=true)
      private final String sourceContainer;

    public String getSourceContainer() {
        return this.sourceContainer;
    }

    public ObjectReplicationPolicyRuleResponse(
        String destinationContainer,
        @Nullable ObjectReplicationPolicyFilterResponse filters,
        @Nullable String ruleId,
        String sourceContainer) {
        this.destinationContainer = Objects.requireNonNull(destinationContainer, "expected parameter 'destinationContainer' to be non-null");
        this.filters = filters;
        this.ruleId = ruleId;
        this.sourceContainer = Objects.requireNonNull(sourceContainer, "expected parameter 'sourceContainer' to be non-null");
    }

    private ObjectReplicationPolicyRuleResponse() {
        this.destinationContainer = null;
        this.filters = null;
        this.ruleId = null;
        this.sourceContainer = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destinationContainer;
        private @Nullable ObjectReplicationPolicyFilterResponse filters;
        private @Nullable String ruleId;
        private String sourceContainer;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationContainer = defaults.destinationContainer;
    	      this.filters = defaults.filters;
    	      this.ruleId = defaults.ruleId;
    	      this.sourceContainer = defaults.sourceContainer;
        }

        public Builder destinationContainer(String destinationContainer) {
            this.destinationContainer = Objects.requireNonNull(destinationContainer);
            return this;
        }
        public Builder filters(@Nullable ObjectReplicationPolicyFilterResponse filters) {
            this.filters = filters;
            return this;
        }
        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Builder sourceContainer(String sourceContainer) {
            this.sourceContainer = Objects.requireNonNull(sourceContainer);
            return this;
        }        public ObjectReplicationPolicyRuleResponse build() {
            return new ObjectReplicationPolicyRuleResponse(destinationContainer, filters, ruleId, sourceContainer);
        }
    }
}
