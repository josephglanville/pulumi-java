// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.appengine.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainMappingResourceRecord {
    private final @Nullable String name;
    private final @Nullable String rrdata;
    private final @Nullable String type;

    @CustomType.Constructor
    private DomainMappingResourceRecord(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("rrdata") @Nullable String rrdata,
        @CustomType.Parameter("type") @Nullable String type) {
        this.name = name;
        this.rrdata = rrdata;
        this.type = type;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getRrdata() {
        return Optional.ofNullable(this.rrdata);
    }
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMappingResourceRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String rrdata;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMappingResourceRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.rrdata = defaults.rrdata;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder rrdata(@Nullable String rrdata) {
            this.rrdata = rrdata;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public DomainMappingResourceRecord build() {
            return new DomainMappingResourceRecord(name, rrdata, type);
        }
    }
}
