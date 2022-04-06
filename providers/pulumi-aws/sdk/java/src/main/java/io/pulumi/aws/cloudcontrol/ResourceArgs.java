// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudcontrol;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceArgs Empty = new ResourceArgs();

    @Import(name="desiredState", required=true)
      private final Output<String> desiredState;

    public Output<String> getDesiredState() {
        return this.desiredState;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to assume for operations.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * JSON string of the CloudFormation resource type schema which is used for plan time validation where possible. Automatically fetched if not provided. In large scale environments with multiple resources using the same `type_name`, it is recommended to fetch the schema once via the `aws.cloudformation.CloudFormationType` data source and use this argument to reduce `DescribeType` API operation throttling. This value is marked sensitive only to prevent large plan differences from showing.
     * 
     */
    @Import(name="schema")
      private final @Nullable Output<String> schema;

    public Output<String> getSchema() {
        return this.schema == null ? Output.empty() : this.schema;
    }

    /**
     * CloudFormation resource type name. For example, `AWS::EC2::VPC`.
     * 
     */
    @Import(name="typeName", required=true)
      private final Output<String> typeName;

    public Output<String> getTypeName() {
        return this.typeName;
    }

    /**
     * Identifier of the CloudFormation resource type version.
     * 
     */
    @Import(name="typeVersionId")
      private final @Nullable Output<String> typeVersionId;

    public Output<String> getTypeVersionId() {
        return this.typeVersionId == null ? Output.empty() : this.typeVersionId;
    }

    public ResourceArgs(
        Output<String> desiredState,
        @Nullable Output<String> roleArn,
        @Nullable Output<String> schema,
        Output<String> typeName,
        @Nullable Output<String> typeVersionId) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.roleArn = roleArn;
        this.schema = schema;
        this.typeName = Objects.requireNonNull(typeName, "expected parameter 'typeName' to be non-null");
        this.typeVersionId = typeVersionId;
    }

    private ResourceArgs() {
        this.desiredState = Output.empty();
        this.roleArn = Output.empty();
        this.schema = Output.empty();
        this.typeName = Output.empty();
        this.typeVersionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> desiredState;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<String> schema;
        private Output<String> typeName;
        private @Nullable Output<String> typeVersionId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.roleArn = defaults.roleArn;
    	      this.schema = defaults.schema;
    	      this.typeName = defaults.typeName;
    	      this.typeVersionId = defaults.typeVersionId;
        }

        public Builder desiredState(Output<String> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }
        public Builder desiredState(String desiredState) {
            this.desiredState = Output.of(Objects.requireNonNull(desiredState));
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public Builder schema(@Nullable Output<String> schema) {
            this.schema = schema;
            return this;
        }
        public Builder schema(@Nullable String schema) {
            this.schema = Output.ofNullable(schema);
            return this;
        }
        public Builder typeName(Output<String> typeName) {
            this.typeName = Objects.requireNonNull(typeName);
            return this;
        }
        public Builder typeName(String typeName) {
            this.typeName = Output.of(Objects.requireNonNull(typeName));
            return this;
        }
        public Builder typeVersionId(@Nullable Output<String> typeVersionId) {
            this.typeVersionId = typeVersionId;
            return this;
        }
        public Builder typeVersionId(@Nullable String typeVersionId) {
            this.typeVersionId = Output.ofNullable(typeVersionId);
            return this;
        }        public ResourceArgs build() {
            return new ResourceArgs(desiredState, roleArn, schema, typeName, typeVersionId);
        }
    }
}