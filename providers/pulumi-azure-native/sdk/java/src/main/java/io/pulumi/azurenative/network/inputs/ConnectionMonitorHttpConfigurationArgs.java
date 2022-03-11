// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.HTTPConfigurationMethod;
import io.pulumi.azurenative.network.inputs.HTTPHeaderArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the HTTP configuration.
 * 
 */
public final class ConnectionMonitorHttpConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorHttpConfigurationArgs Empty = new ConnectionMonitorHttpConfigurationArgs();

    /**
     * The HTTP method to use.
     * 
     */
    @InputImport(name="method")
      private final @Nullable Output<Either<String,HTTPConfigurationMethod>> method;

    public Output<Either<String,HTTPConfigurationMethod>> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * The path component of the URI. For instance, "/dir1/dir2".
     * 
     */
    @InputImport(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * The port to connect to.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Value indicating whether HTTPS is preferred over HTTP in cases where the choice is not explicit.
     * 
     */
    @InputImport(name="preferHTTPS")
      private final @Nullable Output<Boolean> preferHTTPS;

    public Output<Boolean> getPreferHTTPS() {
        return this.preferHTTPS == null ? Output.empty() : this.preferHTTPS;
    }

    /**
     * The HTTP headers to transmit with the request.
     * 
     */
    @InputImport(name="requestHeaders")
      private final @Nullable Output<List<HTTPHeaderArgs>> requestHeaders;

    public Output<List<HTTPHeaderArgs>> getRequestHeaders() {
        return this.requestHeaders == null ? Output.empty() : this.requestHeaders;
    }

    /**
     * HTTP status codes to consider successful. For instance, "2xx,301-304,418".
     * 
     */
    @InputImport(name="validStatusCodeRanges")
      private final @Nullable Output<List<String>> validStatusCodeRanges;

    public Output<List<String>> getValidStatusCodeRanges() {
        return this.validStatusCodeRanges == null ? Output.empty() : this.validStatusCodeRanges;
    }

    public ConnectionMonitorHttpConfigurationArgs(
        @Nullable Output<Either<String,HTTPConfigurationMethod>> method,
        @Nullable Output<String> path,
        @Nullable Output<Integer> port,
        @Nullable Output<Boolean> preferHTTPS,
        @Nullable Output<List<HTTPHeaderArgs>> requestHeaders,
        @Nullable Output<List<String>> validStatusCodeRanges) {
        this.method = method;
        this.path = path;
        this.port = port;
        this.preferHTTPS = preferHTTPS;
        this.requestHeaders = requestHeaders;
        this.validStatusCodeRanges = validStatusCodeRanges;
    }

    private ConnectionMonitorHttpConfigurationArgs() {
        this.method = Output.empty();
        this.path = Output.empty();
        this.port = Output.empty();
        this.preferHTTPS = Output.empty();
        this.requestHeaders = Output.empty();
        this.validStatusCodeRanges = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorHttpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,HTTPConfigurationMethod>> method;
        private @Nullable Output<String> path;
        private @Nullable Output<Integer> port;
        private @Nullable Output<Boolean> preferHTTPS;
        private @Nullable Output<List<HTTPHeaderArgs>> requestHeaders;
        private @Nullable Output<List<String>> validStatusCodeRanges;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorHttpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.preferHTTPS = defaults.preferHTTPS;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.validStatusCodeRanges = defaults.validStatusCodeRanges;
        }

        public Builder method(@Nullable Output<Either<String,HTTPConfigurationMethod>> method) {
            this.method = method;
            return this;
        }

        public Builder method(@Nullable Either<String,HTTPConfigurationMethod> method) {
            this.method = Output.ofNullable(method);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }

        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }

        public Builder preferHTTPS(@Nullable Output<Boolean> preferHTTPS) {
            this.preferHTTPS = preferHTTPS;
            return this;
        }

        public Builder preferHTTPS(@Nullable Boolean preferHTTPS) {
            this.preferHTTPS = Output.ofNullable(preferHTTPS);
            return this;
        }

        public Builder requestHeaders(@Nullable Output<List<HTTPHeaderArgs>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }

        public Builder requestHeaders(@Nullable List<HTTPHeaderArgs> requestHeaders) {
            this.requestHeaders = Output.ofNullable(requestHeaders);
            return this;
        }

        public Builder validStatusCodeRanges(@Nullable Output<List<String>> validStatusCodeRanges) {
            this.validStatusCodeRanges = validStatusCodeRanges;
            return this;
        }

        public Builder validStatusCodeRanges(@Nullable List<String> validStatusCodeRanges) {
            this.validStatusCodeRanges = Output.ofNullable(validStatusCodeRanges);
            return this;
        }
        public ConnectionMonitorHttpConfigurationArgs build() {
            return new ConnectionMonitorHttpConfigurationArgs(method, path, port, preferHTTPS, requestHeaders, validStatusCodeRanges);
        }
    }
}
