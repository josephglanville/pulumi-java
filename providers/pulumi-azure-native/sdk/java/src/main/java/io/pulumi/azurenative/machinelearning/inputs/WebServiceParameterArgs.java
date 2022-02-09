// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebServiceParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebServiceParameterArgs Empty = new WebServiceParameterArgs();

    @InputImport(name="certificateThumbprint")
    private final @Nullable Input<String> certificateThumbprint;

    public Input<String> getCertificateThumbprint() {
        return this.certificateThumbprint == null ? Input.empty() : this.certificateThumbprint;
    }

    @InputImport(name="value")
    private final @Nullable Input<Object> value;

    public Input<Object> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public WebServiceParameterArgs(
        @Nullable Input<String> certificateThumbprint,
        @Nullable Input<Object> value) {
        this.certificateThumbprint = certificateThumbprint;
        this.value = value;
    }

    private WebServiceParameterArgs() {
        this.certificateThumbprint = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServiceParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateThumbprint;
        private @Nullable Input<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServiceParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateThumbprint = defaults.certificateThumbprint;
    	      this.value = defaults.value;
        }

        public Builder setCertificateThumbprint(@Nullable Input<String> certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            return this;
        }

        public Builder setCertificateThumbprint(@Nullable String certificateThumbprint) {
            this.certificateThumbprint = Input.ofNullable(certificateThumbprint);
            return this;
        }

        public Builder setValue(@Nullable Input<Object> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Object value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public WebServiceParameterArgs build() {
            return new WebServiceParameterArgs(certificateThumbprint, value);
        }
    }
}
