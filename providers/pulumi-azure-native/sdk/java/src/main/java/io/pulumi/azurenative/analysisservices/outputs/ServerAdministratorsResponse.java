// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ServerAdministratorsResponse {
    /**
     * An array of administrator user identities.
     * 
     */
    private final @Nullable List<String> members;

    @CustomType.Constructor
    private ServerAdministratorsResponse(@CustomType.Parameter("members") @Nullable List<String> members) {
        this.members = members;
    }

    /**
     * An array of administrator user identities.
     * 
    */
    public List<String> getMembers() {
        return this.members == null ? List.of() : this.members;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerAdministratorsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> members;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerAdministratorsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.members = defaults.members;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = members;
            return this;
        }
        public Builder members(String... members) {
            return members(List.of(members));
        }        public ServerAdministratorsResponse build() {
            return new ServerAdministratorsResponse(members);
        }
    }
}
