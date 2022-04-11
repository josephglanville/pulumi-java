// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TrafficMirrorSessionState extends io.pulumi.resources.ResourceArgs {

    public static final TrafficMirrorSessionState Empty = new TrafficMirrorSessionState();

    /**
     * The ARN of the traffic mirror session.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A description of the traffic mirror session.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * ID of the source network interface. Not all network interfaces are eligible as mirror sources. On EC2 instances only nitro based instances support mirroring.
     * 
     */
    @Import(name="networkInterfaceId")
      private final @Nullable Output<String> networkInterfaceId;

    public Output<String> getNetworkInterfaceId() {
        return this.networkInterfaceId == null ? Codegen.empty() : this.networkInterfaceId;
    }

    /**
     * The AWS account ID of the session owner.
     * 
     */
    @Import(name="ownerId")
      private final @Nullable Output<String> ownerId;

    public Output<String> getOwnerId() {
        return this.ownerId == null ? Codegen.empty() : this.ownerId;
    }

    /**
     * The number of bytes in each packet to mirror. These are bytes after the VXLAN header. Do not specify this parameter when you want to mirror the entire packet. To mirror a subset of the packet, set this to the length (in bytes) that you want to mirror.
     * 
     */
    @Import(name="packetLength")
      private final @Nullable Output<Integer> packetLength;

    public Output<Integer> getPacketLength() {
        return this.packetLength == null ? Codegen.empty() : this.packetLength;
    }

    /**
     * - The session number determines the order in which sessions are evaluated when an interface is used by multiple sessions. The first session with a matching filter is the one that mirrors the packets.
     * 
     */
    @Import(name="sessionNumber")
      private final @Nullable Output<Integer> sessionNumber;

    public Output<Integer> getSessionNumber() {
        return this.sessionNumber == null ? Codegen.empty() : this.sessionNumber;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * ID of the traffic mirror filter to be used
     * 
     */
    @Import(name="trafficMirrorFilterId")
      private final @Nullable Output<String> trafficMirrorFilterId;

    public Output<String> getTrafficMirrorFilterId() {
        return this.trafficMirrorFilterId == null ? Codegen.empty() : this.trafficMirrorFilterId;
    }

    /**
     * ID of the traffic mirror target to be used
     * 
     */
    @Import(name="trafficMirrorTargetId")
      private final @Nullable Output<String> trafficMirrorTargetId;

    public Output<String> getTrafficMirrorTargetId() {
        return this.trafficMirrorTargetId == null ? Codegen.empty() : this.trafficMirrorTargetId;
    }

    /**
     * - The VXLAN ID for the Traffic Mirror session. For more information about the VXLAN protocol, see RFC 7348. If you do not specify a VirtualNetworkId, an account-wide unique id is chosen at random.
     * 
     */
    @Import(name="virtualNetworkId")
      private final @Nullable Output<Integer> virtualNetworkId;

    public Output<Integer> getVirtualNetworkId() {
        return this.virtualNetworkId == null ? Codegen.empty() : this.virtualNetworkId;
    }

    public TrafficMirrorSessionState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> networkInterfaceId,
        @Nullable Output<String> ownerId,
        @Nullable Output<Integer> packetLength,
        @Nullable Output<Integer> sessionNumber,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> trafficMirrorFilterId,
        @Nullable Output<String> trafficMirrorTargetId,
        @Nullable Output<Integer> virtualNetworkId) {
        this.arn = arn;
        this.description = description;
        this.networkInterfaceId = networkInterfaceId;
        this.ownerId = ownerId;
        this.packetLength = packetLength;
        this.sessionNumber = sessionNumber;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.trafficMirrorFilterId = trafficMirrorFilterId;
        this.trafficMirrorTargetId = trafficMirrorTargetId;
        this.virtualNetworkId = virtualNetworkId;
    }

    private TrafficMirrorSessionState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.networkInterfaceId = Codegen.empty();
        this.ownerId = Codegen.empty();
        this.packetLength = Codegen.empty();
        this.sessionNumber = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.trafficMirrorFilterId = Codegen.empty();
        this.trafficMirrorTargetId = Codegen.empty();
        this.virtualNetworkId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TrafficMirrorSessionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> networkInterfaceId;
        private @Nullable Output<String> ownerId;
        private @Nullable Output<Integer> packetLength;
        private @Nullable Output<Integer> sessionNumber;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> trafficMirrorFilterId;
        private @Nullable Output<String> trafficMirrorTargetId;
        private @Nullable Output<Integer> virtualNetworkId;

        public Builder() {
    	      // Empty
        }

        public Builder(TrafficMirrorSessionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.ownerId = defaults.ownerId;
    	      this.packetLength = defaults.packetLength;
    	      this.sessionNumber = defaults.sessionNumber;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.trafficMirrorFilterId = defaults.trafficMirrorFilterId;
    	      this.trafficMirrorTargetId = defaults.trafficMirrorTargetId;
    	      this.virtualNetworkId = defaults.virtualNetworkId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder networkInterfaceId(@Nullable Output<String> networkInterfaceId) {
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }
        public Builder networkInterfaceId(@Nullable String networkInterfaceId) {
            this.networkInterfaceId = Codegen.ofNullable(networkInterfaceId);
            return this;
        }
        public Builder ownerId(@Nullable Output<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Builder ownerId(@Nullable String ownerId) {
            this.ownerId = Codegen.ofNullable(ownerId);
            return this;
        }
        public Builder packetLength(@Nullable Output<Integer> packetLength) {
            this.packetLength = packetLength;
            return this;
        }
        public Builder packetLength(@Nullable Integer packetLength) {
            this.packetLength = Codegen.ofNullable(packetLength);
            return this;
        }
        public Builder sessionNumber(@Nullable Output<Integer> sessionNumber) {
            this.sessionNumber = sessionNumber;
            return this;
        }
        public Builder sessionNumber(@Nullable Integer sessionNumber) {
            this.sessionNumber = Codegen.ofNullable(sessionNumber);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder trafficMirrorFilterId(@Nullable Output<String> trafficMirrorFilterId) {
            this.trafficMirrorFilterId = trafficMirrorFilterId;
            return this;
        }
        public Builder trafficMirrorFilterId(@Nullable String trafficMirrorFilterId) {
            this.trafficMirrorFilterId = Codegen.ofNullable(trafficMirrorFilterId);
            return this;
        }
        public Builder trafficMirrorTargetId(@Nullable Output<String> trafficMirrorTargetId) {
            this.trafficMirrorTargetId = trafficMirrorTargetId;
            return this;
        }
        public Builder trafficMirrorTargetId(@Nullable String trafficMirrorTargetId) {
            this.trafficMirrorTargetId = Codegen.ofNullable(trafficMirrorTargetId);
            return this;
        }
        public Builder virtualNetworkId(@Nullable Output<Integer> virtualNetworkId) {
            this.virtualNetworkId = virtualNetworkId;
            return this;
        }
        public Builder virtualNetworkId(@Nullable Integer virtualNetworkId) {
            this.virtualNetworkId = Codegen.ofNullable(virtualNetworkId);
            return this;
        }        public TrafficMirrorSessionState build() {
            return new TrafficMirrorSessionState(arn, description, networkInterfaceId, ownerId, packetLength, sessionNumber, tags, tagsAll, trafficMirrorFilterId, trafficMirrorTargetId, virtualNetworkId);
        }
    }
}
