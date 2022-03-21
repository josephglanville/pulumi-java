// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification determining how headers are added to requests or responses.
 * 
 */
public final class HttpHeaderOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final HttpHeaderOptionArgs Empty = new HttpHeaderOptionArgs();

    /**
     * The name of the header.
     * 
     */
    @Import(name="headerName")
      private final @Nullable Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName == null ? Output.empty() : this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue")
      private final @Nullable Output<String> headerValue;

    public Output<String> getHeaderValue() {
        return this.headerValue == null ? Output.empty() : this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * 
     */
    @Import(name="replace")
      private final @Nullable Output<Boolean> replace;

    public Output<Boolean> getReplace() {
        return this.replace == null ? Output.empty() : this.replace;
    }

    public HttpHeaderOptionArgs(
        @Nullable Output<String> headerName,
        @Nullable Output<String> headerValue,
        @Nullable Output<Boolean> replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    private HttpHeaderOptionArgs() {
        this.headerName = Output.empty();
        this.headerValue = Output.empty();
        this.replace = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> headerName;
        private @Nullable Output<String> headerValue;
        private @Nullable Output<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder headerName(@Nullable String headerName) {
            this.headerName = Output.ofNullable(headerName);
            return this;
        }
        public Builder headerValue(@Nullable Output<String> headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public Builder headerValue(@Nullable String headerValue) {
            this.headerValue = Output.ofNullable(headerValue);
            return this;
        }
        public Builder replace(@Nullable Output<Boolean> replace) {
            this.replace = replace;
            return this;
        }
        public Builder replace(@Nullable Boolean replace) {
            this.replace = Output.ofNullable(replace);
            return this;
        }        public HttpHeaderOptionArgs build() {
            return new HttpHeaderOptionArgs(headerName, headerValue, replace);
        }
    }
}
