// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionFormatVersion;
import io.pulumi.awsnative.quicksight.enums.DataSetRowLevelPermissionPolicy;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The row-level security configuration for the dataset.</p>
 * 
 */
public final class DataSetRowLevelPermissionDataSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSetRowLevelPermissionDataSetArgs Empty = new DataSetRowLevelPermissionDataSetArgs();

    /**
     * <p>The Amazon Resource Name (ARN) of the permission dataset.</p>
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    @Import(name="formatVersion")
      private final @Nullable Output<DataSetRowLevelPermissionFormatVersion> formatVersion;

    public Output<DataSetRowLevelPermissionFormatVersion> getFormatVersion() {
        return this.formatVersion == null ? Codegen.empty() : this.formatVersion;
    }

    /**
     * <p>The namespace associated with the row-level permissions dataset.</p>
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    @Import(name="permissionPolicy", required=true)
      private final Output<DataSetRowLevelPermissionPolicy> permissionPolicy;

    public Output<DataSetRowLevelPermissionPolicy> getPermissionPolicy() {
        return this.permissionPolicy;
    }

    public DataSetRowLevelPermissionDataSetArgs(
        Output<String> arn,
        @Nullable Output<DataSetRowLevelPermissionFormatVersion> formatVersion,
        @Nullable Output<String> namespace,
        Output<DataSetRowLevelPermissionPolicy> permissionPolicy) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.formatVersion = formatVersion;
        this.namespace = namespace;
        this.permissionPolicy = Objects.requireNonNull(permissionPolicy, "expected parameter 'permissionPolicy' to be non-null");
    }

    private DataSetRowLevelPermissionDataSetArgs() {
        this.arn = Codegen.empty();
        this.formatVersion = Codegen.empty();
        this.namespace = Codegen.empty();
        this.permissionPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSetRowLevelPermissionDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<DataSetRowLevelPermissionFormatVersion> formatVersion;
        private @Nullable Output<String> namespace;
        private Output<DataSetRowLevelPermissionPolicy> permissionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSetRowLevelPermissionDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.formatVersion = defaults.formatVersion;
    	      this.namespace = defaults.namespace;
    	      this.permissionPolicy = defaults.permissionPolicy;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }
        public Builder formatVersion(@Nullable Output<DataSetRowLevelPermissionFormatVersion> formatVersion) {
            this.formatVersion = formatVersion;
            return this;
        }
        public Builder formatVersion(@Nullable DataSetRowLevelPermissionFormatVersion formatVersion) {
            this.formatVersion = Codegen.ofNullable(formatVersion);
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder permissionPolicy(Output<DataSetRowLevelPermissionPolicy> permissionPolicy) {
            this.permissionPolicy = Objects.requireNonNull(permissionPolicy);
            return this;
        }
        public Builder permissionPolicy(DataSetRowLevelPermissionPolicy permissionPolicy) {
            this.permissionPolicy = Output.of(Objects.requireNonNull(permissionPolicy));
            return this;
        }        public DataSetRowLevelPermissionDataSetArgs build() {
            return new DataSetRowLevelPermissionDataSetArgs(arn, formatVersion, namespace, permissionPolicy);
        }
    }
}
