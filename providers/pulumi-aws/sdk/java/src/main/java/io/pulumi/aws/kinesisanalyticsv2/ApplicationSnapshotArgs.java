// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ApplicationSnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationSnapshotArgs Empty = new ApplicationSnapshotArgs();

    /**
     * The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
     * 
     */
    @Import(name="applicationName", required=true)
      private final Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName;
    }

    /**
     * The name of the application snapshot.
     * 
     */
    @Import(name="snapshotName", required=true)
      private final Output<String> snapshotName;

    public Output<String> getSnapshotName() {
        return this.snapshotName;
    }

    public ApplicationSnapshotArgs(
        Output<String> applicationName,
        Output<String> snapshotName) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.snapshotName = Objects.requireNonNull(snapshotName, "expected parameter 'snapshotName' to be non-null");
    }

    private ApplicationSnapshotArgs() {
        this.applicationName = Codegen.empty();
        this.snapshotName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationSnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> applicationName;
        private Output<String> snapshotName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationSnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.snapshotName = defaults.snapshotName;
        }

        public Builder applicationName(Output<String> applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }
        public Builder applicationName(String applicationName) {
            this.applicationName = Output.of(Objects.requireNonNull(applicationName));
            return this;
        }
        public Builder snapshotName(Output<String> snapshotName) {
            this.snapshotName = Objects.requireNonNull(snapshotName);
            return this;
        }
        public Builder snapshotName(String snapshotName) {
            this.snapshotName = Output.of(Objects.requireNonNull(snapshotName));
            return this;
        }        public ApplicationSnapshotArgs build() {
            return new ApplicationSnapshotArgs(applicationName, snapshotName);
        }
    }
}
