// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.enums;

import io.pulumi.core.internal.annotations.EnumType;
import java.lang.String;
import java.util.Objects;
import java.util.StringJoiner;

    @EnumType
    public enum RegionNetworkNetworkFirewallPolicyEnforcementOrder {
        AfterClassicFirewall("AFTER_CLASSIC_FIREWALL"),
        BeforeClassicFirewall("BEFORE_CLASSIC_FIREWALL");

        private final String value;

        RegionNetworkNetworkFirewallPolicyEnforcementOrder(String value) {
            this.value = Objects.requireNonNull(value);
        }

        @EnumType.Converter
        public String getValue() {
            return this.value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", "RegionNetworkNetworkFirewallPolicyEnforcementOrder[", "]")
                .add("value='" + this.value + "'")
                .toString();
        }
    }