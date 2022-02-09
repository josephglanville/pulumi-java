// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions;

import io.pulumi.azurenative.solutions.inputs.JitAuthorizationPoliciesArgs;
import io.pulumi.azurenative.solutions.inputs.JitSchedulingPolicyArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JitRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final JitRequestArgs Empty = new JitRequestArgs();

    @InputImport(name="applicationResourceId", required=true)
    private final Input<String> applicationResourceId;

    public Input<String> getApplicationResourceId() {
        return this.applicationResourceId;
    }

    @InputImport(name="jitAuthorizationPolicies", required=true)
    private final Input<List<JitAuthorizationPoliciesArgs>> jitAuthorizationPolicies;

    public Input<List<JitAuthorizationPoliciesArgs>> getJitAuthorizationPolicies() {
        return this.jitAuthorizationPolicies;
    }

    @InputImport(name="jitRequestName")
    private final @Nullable Input<String> jitRequestName;

    public Input<String> getJitRequestName() {
        return this.jitRequestName == null ? Input.empty() : this.jitRequestName;
    }

    @InputImport(name="jitSchedulingPolicy", required=true)
    private final Input<JitSchedulingPolicyArgs> jitSchedulingPolicy;

    public Input<JitSchedulingPolicyArgs> getJitSchedulingPolicy() {
        return this.jitSchedulingPolicy;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public JitRequestArgs(
        Input<String> applicationResourceId,
        Input<List<JitAuthorizationPoliciesArgs>> jitAuthorizationPolicies,
        @Nullable Input<String> jitRequestName,
        Input<JitSchedulingPolicyArgs> jitSchedulingPolicy,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.applicationResourceId = Objects.requireNonNull(applicationResourceId, "expected parameter 'applicationResourceId' to be non-null");
        this.jitAuthorizationPolicies = Objects.requireNonNull(jitAuthorizationPolicies, "expected parameter 'jitAuthorizationPolicies' to be non-null");
        this.jitRequestName = jitRequestName;
        this.jitSchedulingPolicy = Objects.requireNonNull(jitSchedulingPolicy, "expected parameter 'jitSchedulingPolicy' to be non-null");
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private JitRequestArgs() {
        this.applicationResourceId = Input.empty();
        this.jitAuthorizationPolicies = Input.empty();
        this.jitRequestName = Input.empty();
        this.jitSchedulingPolicy = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationResourceId;
        private Input<List<JitAuthorizationPoliciesArgs>> jitAuthorizationPolicies;
        private @Nullable Input<String> jitRequestName;
        private Input<JitSchedulingPolicyArgs> jitSchedulingPolicy;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(JitRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationResourceId = defaults.applicationResourceId;
    	      this.jitAuthorizationPolicies = defaults.jitAuthorizationPolicies;
    	      this.jitRequestName = defaults.jitRequestName;
    	      this.jitSchedulingPolicy = defaults.jitSchedulingPolicy;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setApplicationResourceId(Input<String> applicationResourceId) {
            this.applicationResourceId = Objects.requireNonNull(applicationResourceId);
            return this;
        }

        public Builder setApplicationResourceId(String applicationResourceId) {
            this.applicationResourceId = Input.of(Objects.requireNonNull(applicationResourceId));
            return this;
        }

        public Builder setJitAuthorizationPolicies(Input<List<JitAuthorizationPoliciesArgs>> jitAuthorizationPolicies) {
            this.jitAuthorizationPolicies = Objects.requireNonNull(jitAuthorizationPolicies);
            return this;
        }

        public Builder setJitAuthorizationPolicies(List<JitAuthorizationPoliciesArgs> jitAuthorizationPolicies) {
            this.jitAuthorizationPolicies = Input.of(Objects.requireNonNull(jitAuthorizationPolicies));
            return this;
        }

        public Builder setJitRequestName(@Nullable Input<String> jitRequestName) {
            this.jitRequestName = jitRequestName;
            return this;
        }

        public Builder setJitRequestName(@Nullable String jitRequestName) {
            this.jitRequestName = Input.ofNullable(jitRequestName);
            return this;
        }

        public Builder setJitSchedulingPolicy(Input<JitSchedulingPolicyArgs> jitSchedulingPolicy) {
            this.jitSchedulingPolicy = Objects.requireNonNull(jitSchedulingPolicy);
            return this;
        }

        public Builder setJitSchedulingPolicy(JitSchedulingPolicyArgs jitSchedulingPolicy) {
            this.jitSchedulingPolicy = Input.of(Objects.requireNonNull(jitSchedulingPolicy));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
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

        public JitRequestArgs build() {
            return new JitRequestArgs(applicationResourceId, jitAuthorizationPolicies, jitRequestName, jitSchedulingPolicy, location, resourceGroupName, tags);
        }
    }
}
