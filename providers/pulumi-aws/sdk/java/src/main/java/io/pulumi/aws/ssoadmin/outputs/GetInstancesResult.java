// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssoadmin.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetInstancesResult {
    /**
     * Set of Amazon Resource Names (ARNs) of the SSO Instances.
     * 
     */
    private final List<String> arns;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Set of identifiers of the identity stores connected to the SSO Instances.
     * 
     */
    private final List<String> identityStoreIds;

    @OutputCustomType.Constructor
    private GetInstancesResult(
        @OutputCustomType.Parameter("arns") List<String> arns,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("identityStoreIds") List<String> identityStoreIds) {
        this.arns = arns;
        this.id = id;
        this.identityStoreIds = identityStoreIds;
    }

    /**
     * Set of Amazon Resource Names (ARNs) of the SSO Instances.
     * 
    */
    public List<String> getArns() {
        return this.arns;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Set of identifiers of the identity stores connected to the SSO Instances.
     * 
    */
    public List<String> getIdentityStoreIds() {
        return this.identityStoreIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> arns;
        private String id;
        private List<String> identityStoreIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstancesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arns = defaults.arns;
    	      this.id = defaults.id;
    	      this.identityStoreIds = defaults.identityStoreIds;
        }

        public Builder setArns(List<String> arns) {
            this.arns = Objects.requireNonNull(arns);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentityStoreIds(List<String> identityStoreIds) {
            this.identityStoreIds = Objects.requireNonNull(identityStoreIds);
            return this;
        }
        public GetInstancesResult build() {
            return new GetInstancesResult(arns, id, identityStoreIds);
        }
    }
}
