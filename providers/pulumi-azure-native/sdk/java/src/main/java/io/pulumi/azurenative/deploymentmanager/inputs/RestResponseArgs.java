// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestResponseRegexArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestResponseArgs Empty = new RestResponseArgs();

    @InputImport(name="regex")
    private final @Nullable Input<RestResponseRegexArgs> regex;

    public Input<RestResponseRegexArgs> getRegex() {
        return this.regex == null ? Input.empty() : this.regex;
    }

    @InputImport(name="successStatusCodes")
    private final @Nullable Input<List<String>> successStatusCodes;

    public Input<List<String>> getSuccessStatusCodes() {
        return this.successStatusCodes == null ? Input.empty() : this.successStatusCodes;
    }

    public RestResponseArgs(
        @Nullable Input<RestResponseRegexArgs> regex,
        @Nullable Input<List<String>> successStatusCodes) {
        this.regex = regex;
        this.successStatusCodes = successStatusCodes;
    }

    private RestResponseArgs() {
        this.regex = Input.empty();
        this.successStatusCodes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RestResponseRegexArgs> regex;
        private @Nullable Input<List<String>> successStatusCodes;

        public Builder() {
    	      // Empty
        }

        public Builder(RestResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.regex = defaults.regex;
    	      this.successStatusCodes = defaults.successStatusCodes;
        }

        public Builder setRegex(@Nullable Input<RestResponseRegexArgs> regex) {
            this.regex = regex;
            return this;
        }

        public Builder setRegex(@Nullable RestResponseRegexArgs regex) {
            this.regex = Input.ofNullable(regex);
            return this;
        }

        public Builder setSuccessStatusCodes(@Nullable Input<List<String>> successStatusCodes) {
            this.successStatusCodes = successStatusCodes;
            return this;
        }

        public Builder setSuccessStatusCodes(@Nullable List<String> successStatusCodes) {
            this.successStatusCodes = Input.ofNullable(successStatusCodes);
            return this;
        }

        public RestResponseArgs build() {
            return new RestResponseArgs(regex, successStatusCodes);
        }
    }
}
