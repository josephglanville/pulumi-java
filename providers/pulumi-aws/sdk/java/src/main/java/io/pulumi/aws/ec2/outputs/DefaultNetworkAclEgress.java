// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DefaultNetworkAclEgress {
    /**
     * The action to take.
     * 
     */
    private final String action;
    /**
     * The CIDR block to match. This must be a valid network mask.
     * 
     */
    private final @Nullable String cidrBlock;
    /**
     * The from port to match.
     * 
     */
    private final Integer fromPort;
    /**
     * The ICMP type code to be used. Default 0.
     * 
     */
    private final @Nullable Integer icmpCode;
    /**
     * The ICMP type to be used. Default 0.
     * 
     */
    private final @Nullable Integer icmpType;
    /**
     * The IPv6 CIDR block.
     * 
     */
    private final @Nullable String ipv6CidrBlock;
    /**
     * The protocol to match. If using the -1 'all' protocol, you must specify a from and to port of 0.
     * 
     */
    private final String protocol;
    /**
     * The rule number. Used for ordering.
     * 
     */
    private final Integer ruleNo;
    /**
     * The to port to match.
     * 
     */
    private final Integer toPort;

    @CustomType.Constructor
    private DefaultNetworkAclEgress(
        @CustomType.Parameter("action") String action,
        @CustomType.Parameter("cidrBlock") @Nullable String cidrBlock,
        @CustomType.Parameter("fromPort") Integer fromPort,
        @CustomType.Parameter("icmpCode") @Nullable Integer icmpCode,
        @CustomType.Parameter("icmpType") @Nullable Integer icmpType,
        @CustomType.Parameter("ipv6CidrBlock") @Nullable String ipv6CidrBlock,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("ruleNo") Integer ruleNo,
        @CustomType.Parameter("toPort") Integer toPort) {
        this.action = action;
        this.cidrBlock = cidrBlock;
        this.fromPort = fromPort;
        this.icmpCode = icmpCode;
        this.icmpType = icmpType;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.protocol = protocol;
        this.ruleNo = ruleNo;
        this.toPort = toPort;
    }

    /**
     * The action to take.
     * 
    */
    public String getAction() {
        return this.action;
    }
    /**
     * The CIDR block to match. This must be a valid network mask.
     * 
    */
    public Optional<String> getCidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }
    /**
     * The from port to match.
     * 
    */
    public Integer getFromPort() {
        return this.fromPort;
    }
    /**
     * The ICMP type code to be used. Default 0.
     * 
    */
    public Optional<Integer> getIcmpCode() {
        return Optional.ofNullable(this.icmpCode);
    }
    /**
     * The ICMP type to be used. Default 0.
     * 
    */
    public Optional<Integer> getIcmpType() {
        return Optional.ofNullable(this.icmpType);
    }
    /**
     * The IPv6 CIDR block.
     * 
    */
    public Optional<String> getIpv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }
    /**
     * The protocol to match. If using the -1 'all' protocol, you must specify a from and to port of 0.
     * 
    */
    public String getProtocol() {
        return this.protocol;
    }
    /**
     * The rule number. Used for ordering.
     * 
    */
    public Integer getRuleNo() {
        return this.ruleNo;
    }
    /**
     * The to port to match.
     * 
    */
    public Integer getToPort() {
        return this.toPort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultNetworkAclEgress defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private @Nullable String cidrBlock;
        private Integer fromPort;
        private @Nullable Integer icmpCode;
        private @Nullable Integer icmpType;
        private @Nullable String ipv6CidrBlock;
        private String protocol;
        private Integer ruleNo;
        private Integer toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultNetworkAclEgress defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.fromPort = defaults.fromPort;
    	      this.icmpCode = defaults.icmpCode;
    	      this.icmpType = defaults.icmpType;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.protocol = defaults.protocol;
    	      this.ruleNo = defaults.ruleNo;
    	      this.toPort = defaults.toPort;
        }

        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder cidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }
        public Builder fromPort(Integer fromPort) {
            this.fromPort = Objects.requireNonNull(fromPort);
            return this;
        }
        public Builder icmpCode(@Nullable Integer icmpCode) {
            this.icmpCode = icmpCode;
            return this;
        }
        public Builder icmpType(@Nullable Integer icmpType) {
            this.icmpType = icmpType;
            return this;
        }
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder ruleNo(Integer ruleNo) {
            this.ruleNo = Objects.requireNonNull(ruleNo);
            return this;
        }
        public Builder toPort(Integer toPort) {
            this.toPort = Objects.requireNonNull(toPort);
            return this;
        }        public DefaultNetworkAclEgress build() {
            return new DefaultNetworkAclEgress(action, cidrBlock, fromPort, icmpCode, icmpType, ipv6CidrBlock, protocol, ruleNo, toPort);
        }
    }
}
