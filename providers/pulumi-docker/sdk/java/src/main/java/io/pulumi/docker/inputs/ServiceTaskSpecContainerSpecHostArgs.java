// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ServiceTaskSpecContainerSpecHostArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecHostArgs Empty = new ServiceTaskSpecContainerSpecHostArgs();

    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> getHost() {
        return this.host;
    }

    @Import(name="ip", required=true)
      private final Output<String> ip;

    public Output<String> getIp() {
        return this.ip;
    }

    public ServiceTaskSpecContainerSpecHostArgs(
        Output<String> host,
        Output<String> ip) {
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.ip = Objects.requireNonNull(ip, "expected parameter 'ip' to be non-null");
    }

    private ServiceTaskSpecContainerSpecHostArgs() {
        this.host = Codegen.empty();
        this.ip = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> host;
        private Output<String> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecHostArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.ip = defaults.ip;
        }

        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder ip(Output<String> ip) {
            this.ip = Objects.requireNonNull(ip);
            return this;
        }
        public Builder ip(String ip) {
            this.ip = Output.of(Objects.requireNonNull(ip));
            return this;
        }        public ServiceTaskSpecContainerSpecHostArgs build() {
            return new ServiceTaskSpecContainerSpecHostArgs(host, ip);
        }
    }
}
