// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Url configuration of the Actions set in Application Gateway.
 * 
 */
public final class ApplicationGatewayUrlConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayUrlConfigurationArgs Empty = new ApplicationGatewayUrlConfigurationArgs();

    /**
     * Url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     * 
     */
    @Import(name="modifiedPath")
      private final @Nullable Output<String> modifiedPath;

    public Output<String> getModifiedPath() {
        return this.modifiedPath == null ? Output.empty() : this.modifiedPath;
    }

    /**
     * Query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     * 
     */
    @Import(name="modifiedQueryString")
      private final @Nullable Output<String> modifiedQueryString;

    public Output<String> getModifiedQueryString() {
        return this.modifiedQueryString == null ? Output.empty() : this.modifiedQueryString;
    }

    /**
     * If set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     * 
     */
    @Import(name="reroute")
      private final @Nullable Output<Boolean> reroute;

    public Output<Boolean> getReroute() {
        return this.reroute == null ? Output.empty() : this.reroute;
    }

    public ApplicationGatewayUrlConfigurationArgs(
        @Nullable Output<String> modifiedPath,
        @Nullable Output<String> modifiedQueryString,
        @Nullable Output<Boolean> reroute) {
        this.modifiedPath = modifiedPath;
        this.modifiedQueryString = modifiedQueryString;
        this.reroute = reroute;
    }

    private ApplicationGatewayUrlConfigurationArgs() {
        this.modifiedPath = Output.empty();
        this.modifiedQueryString = Output.empty();
        this.reroute = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayUrlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> modifiedPath;
        private @Nullable Output<String> modifiedQueryString;
        private @Nullable Output<Boolean> reroute;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayUrlConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.modifiedPath = defaults.modifiedPath;
    	      this.modifiedQueryString = defaults.modifiedQueryString;
    	      this.reroute = defaults.reroute;
        }

        public Builder modifiedPath(@Nullable Output<String> modifiedPath) {
            this.modifiedPath = modifiedPath;
            return this;
        }
        public Builder modifiedPath(@Nullable String modifiedPath) {
            this.modifiedPath = Output.ofNullable(modifiedPath);
            return this;
        }
        public Builder modifiedQueryString(@Nullable Output<String> modifiedQueryString) {
            this.modifiedQueryString = modifiedQueryString;
            return this;
        }
        public Builder modifiedQueryString(@Nullable String modifiedQueryString) {
            this.modifiedQueryString = Output.ofNullable(modifiedQueryString);
            return this;
        }
        public Builder reroute(@Nullable Output<Boolean> reroute) {
            this.reroute = reroute;
            return this;
        }
        public Builder reroute(@Nullable Boolean reroute) {
            this.reroute = Output.ofNullable(reroute);
            return this;
        }        public ApplicationGatewayUrlConfigurationArgs build() {
            return new ApplicationGatewayUrlConfigurationArgs(modifiedPath, modifiedQueryString, reroute);
        }
    }
}
