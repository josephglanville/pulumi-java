// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.chime.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VoiceConnectorOrganizationRoute {
    /**
     * The FQDN or IP address to contact for origination traffic.
     * 
     */
    private final String host;
    /**
     * The designated origination route port. Defaults to `5060`.
     * 
     */
    private final @Nullable Integer port;
    /**
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
     * 
     */
    private final Integer priority;
    /**
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
     * 
     */
    private final String protocol;
    /**
     * The weight associated with the host. If hosts are equal in priority, calls are redistributed among them based on their relative weight.
     * 
     */
    private final Integer weight;

    @CustomType.Constructor
    private VoiceConnectorOrganizationRoute(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("priority") Integer priority,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("weight") Integer weight) {
        this.host = host;
        this.port = port;
        this.priority = priority;
        this.protocol = protocol;
        this.weight = weight;
    }

    /**
     * The FQDN or IP address to contact for origination traffic.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * The designated origination route port. Defaults to `5060`.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * The priority associated with the host, with 1 being the highest priority. Higher priority hosts are attempted first.
     * 
    */
    public Integer getPriority() {
        return this.priority;
    }
    /**
     * The protocol to use for the origination route. Encryption-enabled Amazon Chime Voice Connectors use TCP protocol by default.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The weight associated with the host. If hosts are equal in priority, calls are redistributed among them based on their relative weight.
     * 
    */
    public Integer getWeight() {
        return this.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VoiceConnectorOrganizationRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private @Nullable Integer port;
        private Integer priority;
        private String protocol;
        private Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(VoiceConnectorOrganizationRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.port = defaults.port;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.weight = defaults.weight;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder weight(Integer weight) {
            this.weight = Objects.requireNonNull(weight);
            return this;
        }        public VoiceConnectorOrganizationRoute build() {
            return new VoiceConnectorOrganizationRoute(host, port, priority, protocol, weight);
        }
    }
}