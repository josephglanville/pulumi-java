// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PrivateEndpointACLResponse {
    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    private final @Nullable List<String> allow;
    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
     */
    private final @Nullable List<String> deny;
    /**
     * Name of the private endpoint connection
     * 
     */
    private final String name;

    @CustomType.Constructor
    private PrivateEndpointACLResponse(
        @CustomType.Parameter("allow") @Nullable List<String> allow,
        @CustomType.Parameter("deny") @Nullable List<String> deny,
        @CustomType.Parameter("name") String name) {
        this.allow = allow;
        this.deny = deny;
        this.name = name;
    }

    /**
     * Allowed request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
    */
    public List<String> getAllow() {
        return this.allow == null ? List.of() : this.allow;
    }
    /**
     * Denied request types. The value can be one or more of: ClientConnection, ServerConnection, RESTAPI.
     * 
    */
    public List<String> getDeny() {
        return this.deny == null ? List.of() : this.deny;
    }
    /**
     * Name of the private endpoint connection
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointACLResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allow;
        private @Nullable List<String> deny;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointACLResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.deny = defaults.deny;
    	      this.name = defaults.name;
        }

        public Builder allow(@Nullable List<String> allow) {
            this.allow = allow;
            return this;
        }
        public Builder allow(String... allow) {
            return allow(List.of(allow));
        }
        public Builder deny(@Nullable List<String> deny) {
            this.deny = deny;
            return this;
        }
        public Builder deny(String... deny) {
            return deny(List.of(deny));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public PrivateEndpointACLResponse build() {
            return new PrivateEndpointACLResponse(allow, deny, name);
        }
    }
}
