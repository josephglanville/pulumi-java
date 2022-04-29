// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Dns.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResolverEndpointArgs Empty = new ResolverEndpointArgs();

    /**
     * (Updatable) The OCID of the owning compartment.
     * 
     */
    @Import(name="compartmentId")
    private @Nullable Output<String> compartmentId;

    /**
     * @return (Updatable) The OCID of the owning compartment.
     * 
     */
    public Optional<Output<String>> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }

    /**
     * The type of resolver endpoint. VNIC is currently the only supported type.
     * 
     */
    @Import(name="endpointType")
    private @Nullable Output<String> endpointType;

    /**
     * @return The type of resolver endpoint. VNIC is currently the only supported type.
     * 
     */
    public Optional<Output<String>> endpointType() {
        return Optional.ofNullable(this.endpointType);
    }

    /**
     * An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address must be part of the subnet and will be assigned by the system if unspecified when isForwarding is true.
     * 
     */
    @Import(name="forwardingAddress")
    private @Nullable Output<String> forwardingAddress;

    /**
     * @return An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address must be part of the subnet and will be assigned by the system if unspecified when isForwarding is true.
     * 
     */
    public Optional<Output<String>> forwardingAddress() {
        return Optional.ofNullable(this.forwardingAddress);
    }

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
     * 
     */
    @Import(name="isForwarding")
    private @Nullable Output<Boolean> isForwarding;

    /**
     * @return A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
     * 
     */
    public Optional<Output<Boolean>> isForwarding() {
        return Optional.ofNullable(this.isForwarding);
    }

    /**
     * A Boolean flag indicating whether or not the resolver endpoint is for listening.
     * 
     */
    @Import(name="isListening")
    private @Nullable Output<Boolean> isListening;

    /**
     * @return A Boolean flag indicating whether or not the resolver endpoint is for listening.
     * 
     */
    public Optional<Output<Boolean>> isListening() {
        return Optional.ofNullable(this.isListening);
    }

    /**
     * An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the subnet and will be assigned by the system if unspecified when isListening is true.
     * 
     */
    @Import(name="listeningAddress")
    private @Nullable Output<String> listeningAddress;

    /**
     * @return An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the subnet and will be assigned by the system if unspecified when isListening is true.
     * 
     */
    public Optional<Output<String>> listeningAddress() {
        return Optional.ofNullable(this.listeningAddress);
    }

    /**
     * The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The canonical absolute URL of the resource.
     * 
     */
    @Import(name="self")
    private @Nullable Output<String> self;

    /**
     * @return The canonical absolute URL of the resource.
     * 
     */
    public Optional<Output<String>> self() {
        return Optional.ofNullable(this.self);
    }

    /**
     * The current state of the resource.
     * 
     */
    @Import(name="state")
    private @Nullable Output<String> state;

    /**
     * @return The current state of the resource.
     * 
     */
    public Optional<Output<String>> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     * 
     */
    @Import(name="subnetId")
    private @Nullable Output<String> subnetId;

    /**
     * @return The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
     * 
     */
    public Optional<Output<String>> subnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    /**
     * The date and time the resource was created in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return The date and time the resource was created in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    /**
     * The date and time the resource was last updated in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    @Import(name="timeUpdated")
    private @Nullable Output<String> timeUpdated;

    /**
     * @return The date and time the resource was last updated in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
     * 
     */
    public Optional<Output<String>> timeUpdated() {
        return Optional.ofNullable(this.timeUpdated);
    }

    private ResolverEndpointArgs() {}

    private ResolverEndpointArgs(ResolverEndpointArgs $) {
        this.compartmentId = $.compartmentId;
        this.endpointType = $.endpointType;
        this.forwardingAddress = $.forwardingAddress;
        this.isForwarding = $.isForwarding;
        this.isListening = $.isListening;
        this.listeningAddress = $.listeningAddress;
        this.name = $.name;
        this.self = $.self;
        this.state = $.state;
        this.subnetId = $.subnetId;
        this.timeCreated = $.timeCreated;
        this.timeUpdated = $.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverEndpointArgs $;

        public Builder() {
            $ = new ResolverEndpointArgs();
        }

        public Builder(ResolverEndpointArgs defaults) {
            $ = new ResolverEndpointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param compartmentId (Updatable) The OCID of the owning compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(@Nullable Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId (Updatable) The OCID of the owning compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        /**
         * @param endpointType The type of resolver endpoint. VNIC is currently the only supported type.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(@Nullable Output<String> endpointType) {
            $.endpointType = endpointType;
            return this;
        }

        /**
         * @param endpointType The type of resolver endpoint. VNIC is currently the only supported type.
         * 
         * @return builder
         * 
         */
        public Builder endpointType(String endpointType) {
            return endpointType(Output.of(endpointType));
        }

        /**
         * @param forwardingAddress An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address must be part of the subnet and will be assigned by the system if unspecified when isForwarding is true.
         * 
         * @return builder
         * 
         */
        public Builder forwardingAddress(@Nullable Output<String> forwardingAddress) {
            $.forwardingAddress = forwardingAddress;
            return this;
        }

        /**
         * @param forwardingAddress An IP address from which forwarded queries may be sent. For VNIC endpoints, this IP address must be part of the subnet and will be assigned by the system if unspecified when isForwarding is true.
         * 
         * @return builder
         * 
         */
        public Builder forwardingAddress(String forwardingAddress) {
            return forwardingAddress(Output.of(forwardingAddress));
        }

        /**
         * @param isForwarding A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
         * 
         * @return builder
         * 
         */
        public Builder isForwarding(@Nullable Output<Boolean> isForwarding) {
            $.isForwarding = isForwarding;
            return this;
        }

        /**
         * @param isForwarding A Boolean flag indicating whether or not the resolver endpoint is for forwarding.
         * 
         * @return builder
         * 
         */
        public Builder isForwarding(Boolean isForwarding) {
            return isForwarding(Output.of(isForwarding));
        }

        /**
         * @param isListening A Boolean flag indicating whether or not the resolver endpoint is for listening.
         * 
         * @return builder
         * 
         */
        public Builder isListening(@Nullable Output<Boolean> isListening) {
            $.isListening = isListening;
            return this;
        }

        /**
         * @param isListening A Boolean flag indicating whether or not the resolver endpoint is for listening.
         * 
         * @return builder
         * 
         */
        public Builder isListening(Boolean isListening) {
            return isListening(Output.of(isListening));
        }

        /**
         * @param listeningAddress An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the subnet and will be assigned by the system if unspecified when isListening is true.
         * 
         * @return builder
         * 
         */
        public Builder listeningAddress(@Nullable Output<String> listeningAddress) {
            $.listeningAddress = listeningAddress;
            return this;
        }

        /**
         * @param listeningAddress An IP address to listen to queries on. For VNIC endpoints this IP address must be part of the subnet and will be assigned by the system if unspecified when isListening is true.
         * 
         * @return builder
         * 
         */
        public Builder listeningAddress(String listeningAddress) {
            return listeningAddress(Output.of(listeningAddress));
        }

        /**
         * @param name The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the resolver endpoint. Must be unique, case-insensitive, within the resolver.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param self The canonical absolute URL of the resource.
         * 
         * @return builder
         * 
         */
        public Builder self(@Nullable Output<String> self) {
            $.self = self;
            return this;
        }

        /**
         * @param self The canonical absolute URL of the resource.
         * 
         * @return builder
         * 
         */
        public Builder self(String self) {
            return self(Output.of(self));
        }

        /**
         * @param state The current state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable Output<String> state) {
            $.state = state;
            return this;
        }

        /**
         * @param state The current state of the resource.
         * 
         * @return builder
         * 
         */
        public Builder state(String state) {
            return state(Output.of(state));
        }

        /**
         * @param subnetId The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(@Nullable Output<String> subnetId) {
            $.subnetId = subnetId;
            return this;
        }

        /**
         * @param subnetId The OCID of a subnet. Must be part of the VCN that the resolver is attached to.
         * 
         * @return builder
         * 
         */
        public Builder subnetId(String subnetId) {
            return subnetId(Output.of(subnetId));
        }

        /**
         * @param timeCreated The date and time the resource was created in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated The date and time the resource was created in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        /**
         * @param timeUpdated The date and time the resource was last updated in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(@Nullable Output<String> timeUpdated) {
            $.timeUpdated = timeUpdated;
            return this;
        }

        /**
         * @param timeUpdated The date and time the resource was last updated in &#34;YYYY-MM-ddThh:mm:ssZ&#34; format with a Z offset, as defined by RFC 3339.
         * 
         * @return builder
         * 
         */
        public Builder timeUpdated(String timeUpdated) {
            return timeUpdated(Output.of(timeUpdated));
        }

        public ResolverEndpointArgs build() {
            return $;
        }
    }

}
