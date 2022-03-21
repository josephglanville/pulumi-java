// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class LocationHdfsNameNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHdfsNameNodeArgs Empty = new LocationHdfsNameNodeArgs();

    /**
     * The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that's installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
     */
    @Import(name="hostname", required=true)
      private final Output<String> hostname;

    public Output<String> getHostname() {
        return this.hostname;
    }

    /**
     * The port that the NameNode uses to listen to client requests.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port;
    }

    public LocationHdfsNameNodeArgs(
        Output<String> hostname,
        Output<Integer> port) {
        this.hostname = Objects.requireNonNull(hostname, "expected parameter 'hostname' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private LocationHdfsNameNodeArgs() {
        this.hostname = Output.empty();
        this.port = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsNameNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> hostname;
        private Output<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHdfsNameNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        public Builder hostname(Output<String> hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        public Builder hostname(String hostname) {
            this.hostname = Output.of(Objects.requireNonNull(hostname));
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }        public LocationHdfsNameNodeArgs build() {
            return new LocationHdfsNameNodeArgs(hostname, port);
        }
    }
}
