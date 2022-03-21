// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.ExtensionOptionType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeExtensionOptionsResourceCreationBeginArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeExtensionOptionsResourceCreationBeginArgs Empty = new ResourceTypeExtensionOptionsResourceCreationBeginArgs();

    @Import(name="request")
      private final @Nullable Output<List<Either<String,ExtensionOptionType>>> request;

    public Output<List<Either<String,ExtensionOptionType>>> getRequest() {
        return this.request == null ? Output.empty() : this.request;
    }

    @Import(name="response")
      private final @Nullable Output<List<Either<String,ExtensionOptionType>>> response;

    public Output<List<Either<String,ExtensionOptionType>>> getResponse() {
        return this.response == null ? Output.empty() : this.response;
    }

    public ResourceTypeExtensionOptionsResourceCreationBeginArgs(
        @Nullable Output<List<Either<String,ExtensionOptionType>>> request,
        @Nullable Output<List<Either<String,ExtensionOptionType>>> response) {
        this.request = request;
        this.response = response;
    }

    private ResourceTypeExtensionOptionsResourceCreationBeginArgs() {
        this.request = Output.empty();
        this.response = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeExtensionOptionsResourceCreationBeginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<Either<String,ExtensionOptionType>>> request;
        private @Nullable Output<List<Either<String,ExtensionOptionType>>> response;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeExtensionOptionsResourceCreationBeginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.request = defaults.request;
    	      this.response = defaults.response;
        }

        public Builder request(@Nullable Output<List<Either<String,ExtensionOptionType>>> request) {
            this.request = request;
            return this;
        }
        public Builder request(@Nullable List<Either<String,ExtensionOptionType>> request) {
            this.request = Output.ofNullable(request);
            return this;
        }
        public Builder request(Either<String,ExtensionOptionType>... request) {
            return request(List.of(request));
        }
        public Builder response(@Nullable Output<List<Either<String,ExtensionOptionType>>> response) {
            this.response = response;
            return this;
        }
        public Builder response(@Nullable List<Either<String,ExtensionOptionType>> response) {
            this.response = Output.ofNullable(response);
            return this;
        }
        public Builder response(Either<String,ExtensionOptionType>... response) {
            return response(List.of(response));
        }        public ResourceTypeExtensionOptionsResourceCreationBeginArgs build() {
            return new ResourceTypeExtensionOptionsResourceCreationBeginArgs(request, response);
        }
    }
}
