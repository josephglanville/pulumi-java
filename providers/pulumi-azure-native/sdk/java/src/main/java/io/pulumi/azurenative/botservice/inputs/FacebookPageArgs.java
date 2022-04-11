// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Facebook page for Facebook channel registration
 * 
 */
public final class FacebookPageArgs extends io.pulumi.resources.ResourceArgs {

    public static final FacebookPageArgs Empty = new FacebookPageArgs();

    /**
     * Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="accessToken")
      private final @Nullable Output<String> accessToken;

    public Output<String> getAccessToken() {
        return this.accessToken == null ? Codegen.empty() : this.accessToken;
    }

    /**
     * Page id
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    public FacebookPageArgs(
        @Nullable Output<String> accessToken,
        Output<String> id) {
        this.accessToken = accessToken;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private FacebookPageArgs() {
        this.accessToken = Codegen.empty();
        this.id = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FacebookPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessToken;
        private Output<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(FacebookPageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.id = defaults.id;
        }

        public Builder accessToken(@Nullable Output<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }
        public Builder accessToken(@Nullable String accessToken) {
            this.accessToken = Codegen.ofNullable(accessToken);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }        public FacebookPageArgs build() {
            return new FacebookPageArgs(accessToken, id);
        }
    }
}
