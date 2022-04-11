// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainMasterUserOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainMasterUserOptionsArgs Empty = new DomainMasterUserOptionsArgs();

    @Import(name="masterUserARN")
      private final @Nullable Output<String> masterUserARN;

    public Output<String> getMasterUserARN() {
        return this.masterUserARN == null ? Codegen.empty() : this.masterUserARN;
    }

    @Import(name="masterUserName")
      private final @Nullable Output<String> masterUserName;

    public Output<String> getMasterUserName() {
        return this.masterUserName == null ? Codegen.empty() : this.masterUserName;
    }

    @Import(name="masterUserPassword")
      private final @Nullable Output<String> masterUserPassword;

    public Output<String> getMasterUserPassword() {
        return this.masterUserPassword == null ? Codegen.empty() : this.masterUserPassword;
    }

    public DomainMasterUserOptionsArgs(
        @Nullable Output<String> masterUserARN,
        @Nullable Output<String> masterUserName,
        @Nullable Output<String> masterUserPassword) {
        this.masterUserARN = masterUserARN;
        this.masterUserName = masterUserName;
        this.masterUserPassword = masterUserPassword;
    }

    private DomainMasterUserOptionsArgs() {
        this.masterUserARN = Codegen.empty();
        this.masterUserName = Codegen.empty();
        this.masterUserPassword = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainMasterUserOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> masterUserARN;
        private @Nullable Output<String> masterUserName;
        private @Nullable Output<String> masterUserPassword;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainMasterUserOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.masterUserARN = defaults.masterUserARN;
    	      this.masterUserName = defaults.masterUserName;
    	      this.masterUserPassword = defaults.masterUserPassword;
        }

        public Builder masterUserARN(@Nullable Output<String> masterUserARN) {
            this.masterUserARN = masterUserARN;
            return this;
        }
        public Builder masterUserARN(@Nullable String masterUserARN) {
            this.masterUserARN = Codegen.ofNullable(masterUserARN);
            return this;
        }
        public Builder masterUserName(@Nullable Output<String> masterUserName) {
            this.masterUserName = masterUserName;
            return this;
        }
        public Builder masterUserName(@Nullable String masterUserName) {
            this.masterUserName = Codegen.ofNullable(masterUserName);
            return this;
        }
        public Builder masterUserPassword(@Nullable Output<String> masterUserPassword) {
            this.masterUserPassword = masterUserPassword;
            return this;
        }
        public Builder masterUserPassword(@Nullable String masterUserPassword) {
            this.masterUserPassword = Codegen.ofNullable(masterUserPassword);
            return this;
        }        public DomainMasterUserOptionsArgs build() {
            return new DomainMasterUserOptionsArgs(masterUserARN, masterUserName, masterUserPassword);
        }
    }
}
