// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.inputs;

import io.pulumi.aws.cfg.inputs.RecorderRecordingGroupGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RecorderState extends io.pulumi.resources.ResourceArgs {

    public static final RecorderState Empty = new RecorderState();

    /**
     * The name of the recorder. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Recording group - see below.
     * 
     */
    @Import(name="recordingGroup")
      private final @Nullable Output<RecorderRecordingGroupGetArgs> recordingGroup;

    public Output<RecorderRecordingGroupGetArgs> getRecordingGroup() {
        return this.recordingGroup == null ? Codegen.empty() : this.recordingGroup;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role. Used to make read or write requests to the delivery channel and to describe the AWS resources associated with the account. See [AWS Docs](http://docs.aws.amazon.com/config/latest/developerguide/iamrole-permissions.html) for more details.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    public RecorderState(
        @Nullable Output<String> name,
        @Nullable Output<RecorderRecordingGroupGetArgs> recordingGroup,
        @Nullable Output<String> roleArn) {
        this.name = name;
        this.recordingGroup = recordingGroup;
        this.roleArn = roleArn;
    }

    private RecorderState() {
        this.name = Codegen.empty();
        this.recordingGroup = Codegen.empty();
        this.roleArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecorderState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<RecorderRecordingGroupGetArgs> recordingGroup;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(RecorderState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.recordingGroup = defaults.recordingGroup;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder recordingGroup(@Nullable Output<RecorderRecordingGroupGetArgs> recordingGroup) {
            this.recordingGroup = recordingGroup;
            return this;
        }
        public Builder recordingGroup(@Nullable RecorderRecordingGroupGetArgs recordingGroup) {
            this.recordingGroup = Codegen.ofNullable(recordingGroup);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }        public RecorderState build() {
            return new RecorderState(name, recordingGroup, roleArn);
        }
    }
}
