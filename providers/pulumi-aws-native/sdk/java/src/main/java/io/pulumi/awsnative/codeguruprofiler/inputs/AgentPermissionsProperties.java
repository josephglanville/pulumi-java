// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The agent permissions attached to this profiling group.
 * 
 */
public final class AgentPermissionsProperties extends io.pulumi.resources.InvokeArgs {

    public static final AgentPermissionsProperties Empty = new AgentPermissionsProperties();

    /**
     * The principals for the agent permissions.
     * 
     */
    @InputImport(name="principals", required=true)
      private final List<String> principals;

    public List<String> getPrincipals() {
        return this.principals;
    }

    public AgentPermissionsProperties(List<String> principals) {
        this.principals = Objects.requireNonNull(principals, "expected parameter 'principals' to be non-null");
    }

    private AgentPermissionsProperties() {
        this.principals = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AgentPermissionsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> principals;

        public Builder() {
    	      // Empty
        }

        public Builder(AgentPermissionsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principals = defaults.principals;
        }

        public Builder setPrincipals(List<String> principals) {
            this.principals = Objects.requireNonNull(principals);
            return this;
        }
        public AgentPermissionsProperties build() {
            return new AgentPermissionsProperties(principals);
        }
    }
}
