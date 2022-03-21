// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.enums.NetworkInsightsPathProtocol;
import io.pulumi.awsnative.ec2.inputs.NetworkInsightsPathTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInsightsPathArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInsightsPathArgs Empty = new NetworkInsightsPathArgs();

    @Import(name="destination", required=true)
      private final Output<String> destination;

    public Output<String> getDestination() {
        return this.destination;
    }

    @Import(name="destinationIp")
      private final @Nullable Output<String> destinationIp;

    public Output<String> getDestinationIp() {
        return this.destinationIp == null ? Output.empty() : this.destinationIp;
    }

    @Import(name="destinationPort")
      private final @Nullable Output<Integer> destinationPort;

    public Output<Integer> getDestinationPort() {
        return this.destinationPort == null ? Output.empty() : this.destinationPort;
    }

    @Import(name="protocol", required=true)
      private final Output<NetworkInsightsPathProtocol> protocol;

    public Output<NetworkInsightsPathProtocol> getProtocol() {
        return this.protocol;
    }

    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    @Import(name="sourceIp")
      private final @Nullable Output<String> sourceIp;

    public Output<String> getSourceIp() {
        return this.sourceIp == null ? Output.empty() : this.sourceIp;
    }

    @Import(name="tags")
      private final @Nullable Output<List<NetworkInsightsPathTagArgs>> tags;

    public Output<List<NetworkInsightsPathTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public NetworkInsightsPathArgs(
        Output<String> destination,
        @Nullable Output<String> destinationIp,
        @Nullable Output<Integer> destinationPort,
        Output<NetworkInsightsPathProtocol> protocol,
        Output<String> source,
        @Nullable Output<String> sourceIp,
        @Nullable Output<List<NetworkInsightsPathTagArgs>> tags) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.destinationIp = destinationIp;
        this.destinationPort = destinationPort;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.sourceIp = sourceIp;
        this.tags = tags;
    }

    private NetworkInsightsPathArgs() {
        this.destination = Output.empty();
        this.destinationIp = Output.empty();
        this.destinationPort = Output.empty();
        this.protocol = Output.empty();
        this.source = Output.empty();
        this.sourceIp = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsPathArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destination;
        private @Nullable Output<String> destinationIp;
        private @Nullable Output<Integer> destinationPort;
        private Output<NetworkInsightsPathProtocol> protocol;
        private Output<String> source;
        private @Nullable Output<String> sourceIp;
        private @Nullable Output<List<NetworkInsightsPathTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsPathArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationPort = defaults.destinationPort;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourceIp = defaults.sourceIp;
    	      this.tags = defaults.tags;
        }

        public Builder destination(Output<String> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public Builder destination(String destination) {
            this.destination = Output.of(Objects.requireNonNull(destination));
            return this;
        }
        public Builder destinationIp(@Nullable Output<String> destinationIp) {
            this.destinationIp = destinationIp;
            return this;
        }
        public Builder destinationIp(@Nullable String destinationIp) {
            this.destinationIp = Output.ofNullable(destinationIp);
            return this;
        }
        public Builder destinationPort(@Nullable Output<Integer> destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public Builder destinationPort(@Nullable Integer destinationPort) {
            this.destinationPort = Output.ofNullable(destinationPort);
            return this;
        }
        public Builder protocol(Output<NetworkInsightsPathProtocol> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder protocol(NetworkInsightsPathProtocol protocol) {
            this.protocol = Output.of(Objects.requireNonNull(protocol));
            return this;
        }
        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }
        public Builder sourceIp(@Nullable Output<String> sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public Builder sourceIp(@Nullable String sourceIp) {
            this.sourceIp = Output.ofNullable(sourceIp);
            return this;
        }
        public Builder tags(@Nullable Output<List<NetworkInsightsPathTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<NetworkInsightsPathTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(NetworkInsightsPathTagArgs... tags) {
            return tags(List.of(tags));
        }        public NetworkInsightsPathArgs build() {
            return new NetworkInsightsPathArgs(destination, destinationIp, destinationPort, protocol, source, sourceIp, tags);
        }
    }
}
