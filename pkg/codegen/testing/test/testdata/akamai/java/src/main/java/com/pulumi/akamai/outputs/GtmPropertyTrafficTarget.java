// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GtmPropertyTrafficTarget {
    private @Nullable Integer datacenterId;
    private @Nullable Boolean enabled;
    private @Nullable String handoutCname;
    /**
     * @deprecated
     * The attribute `name` has been deprecated. Any reads or writes on this attribute are ignored
     * 
     */
    @Deprecated /* The attribute `name` has been deprecated. Any reads or writes on this attribute are ignored */
    private @Nullable String name;
    private @Nullable List<String> servers;
    private @Nullable Double weight;

    private GtmPropertyTrafficTarget() {}
    public Optional<Integer> datacenterId() {
        return Optional.ofNullable(this.datacenterId);
    }
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<String> handoutCname() {
        return Optional.ofNullable(this.handoutCname);
    }
    /**
     * @deprecated
     * The attribute `name` has been deprecated. Any reads or writes on this attribute are ignored
     * 
     */
    @Deprecated /* The attribute `name` has been deprecated. Any reads or writes on this attribute are ignored */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public List<String> servers() {
        return this.servers == null ? List.of() : this.servers;
    }
    public Optional<Double> weight() {
        return Optional.ofNullable(this.weight);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GtmPropertyTrafficTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer datacenterId;
        private @Nullable Boolean enabled;
        private @Nullable String handoutCname;
        private @Nullable String name;
        private @Nullable List<String> servers;
        private @Nullable Double weight;
        public Builder() {}
        public Builder(GtmPropertyTrafficTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datacenterId = defaults.datacenterId;
    	      this.enabled = defaults.enabled;
    	      this.handoutCname = defaults.handoutCname;
    	      this.name = defaults.name;
    	      this.servers = defaults.servers;
    	      this.weight = defaults.weight;
        }

        @CustomType.Setter
        public Builder datacenterId(@Nullable Integer datacenterId) {

            this.datacenterId = datacenterId;
            return this;
        }
        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {

            this.enabled = enabled;
            return this;
        }
        @CustomType.Setter
        public Builder handoutCname(@Nullable String handoutCname) {

            this.handoutCname = handoutCname;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {

            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder servers(@Nullable List<String> servers) {

            this.servers = servers;
            return this;
        }
        public Builder servers(String... servers) {
            return servers(List.of(servers));
        }
        @CustomType.Setter
        public Builder weight(@Nullable Double weight) {

            this.weight = weight;
            return this;
        }
        public GtmPropertyTrafficTarget build() {
            final var _resultValue = new GtmPropertyTrafficTarget();
            _resultValue.datacenterId = datacenterId;
            _resultValue.enabled = enabled;
            _resultValue.handoutCname = handoutCname;
            _resultValue.name = name;
            _resultValue.servers = servers;
            _resultValue.weight = weight;
            return _resultValue;
        }
    }
}
