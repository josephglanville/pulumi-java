// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegistryImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegistryImageArgs Empty = new GetRegistryImageArgs();

    @Import(name="insecureSkipVerify")
      private final @Nullable Boolean insecureSkipVerify;

    public Optional<Boolean> getInsecureSkipVerify() {
        return this.insecureSkipVerify == null ? Optional.empty() : Optional.ofNullable(this.insecureSkipVerify);
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetRegistryImageArgs(
        @Nullable Boolean insecureSkipVerify,
        String name) {
        this.insecureSkipVerify = insecureSkipVerify;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetRegistryImageArgs() {
        this.insecureSkipVerify = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegistryImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean insecureSkipVerify;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegistryImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insecureSkipVerify = defaults.insecureSkipVerify;
    	      this.name = defaults.name;
        }

        public Builder insecureSkipVerify(@Nullable Boolean insecureSkipVerify) {
            this.insecureSkipVerify = insecureSkipVerify;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetRegistryImageArgs build() {
            return new GetRegistryImageArgs(insecureSkipVerify, name);
        }
    }
}