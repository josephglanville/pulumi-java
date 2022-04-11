// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatabaseInstanceIpAddressGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInstanceIpAddressGetArgs Empty = new DatabaseInstanceIpAddressGetArgs();

    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> getIpAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    @Import(name="timeToRetire")
      private final @Nullable Output<String> timeToRetire;

    public Output<String> getTimeToRetire() {
        return this.timeToRetire == null ? Codegen.empty() : this.timeToRetire;
    }

    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public DatabaseInstanceIpAddressGetArgs(
        @Nullable Output<String> ipAddress,
        @Nullable Output<String> timeToRetire,
        @Nullable Output<String> type) {
        this.ipAddress = ipAddress;
        this.timeToRetire = timeToRetire;
        this.type = type;
    }

    private DatabaseInstanceIpAddressGetArgs() {
        this.ipAddress = Codegen.empty();
        this.timeToRetire = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInstanceIpAddressGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> ipAddress;
        private @Nullable Output<String> timeToRetire;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInstanceIpAddressGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.timeToRetire = defaults.timeToRetire;
    	      this.type = defaults.type;
        }

        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder timeToRetire(@Nullable Output<String> timeToRetire) {
            this.timeToRetire = timeToRetire;
            return this;
        }
        public Builder timeToRetire(@Nullable String timeToRetire) {
            this.timeToRetire = Codegen.ofNullable(timeToRetire);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public DatabaseInstanceIpAddressGetArgs build() {
            return new DatabaseInstanceIpAddressGetArgs(ipAddress, timeToRetire, type);
        }
    }
}
