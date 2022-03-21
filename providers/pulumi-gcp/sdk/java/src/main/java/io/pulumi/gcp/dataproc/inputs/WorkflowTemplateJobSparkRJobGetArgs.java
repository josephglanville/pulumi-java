// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobSparkRJobLoggingConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobSparkRJobGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobSparkRJobGetArgs Empty = new WorkflowTemplateJobSparkRJobGetArgs();

    /**
     * Optional. HCFS URIs of archives to be extracted into the working directory of each executor. Supported file types: .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @Import(name="archiveUris")
      private final @Nullable Output<List<String>> archiveUris;

    public Output<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Output.empty() : this.archiveUris;
    }

    /**
     * Optional. The arguments to pass to the driver. Do not include arguments, such as `--conf`, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * Optional. HCFS URIs of files to be placed in the working directory of each executor. Useful for naively parallel tasks.
     * 
     */
    @Import(name="fileUris")
      private final @Nullable Output<List<String>> fileUris;

    public Output<List<String>> getFileUris() {
        return this.fileUris == null ? Output.empty() : this.fileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
      private final @Nullable Output<WorkflowTemplateJobSparkRJobLoggingConfigGetArgs> loggingConfig;

    public Output<WorkflowTemplateJobSparkRJobLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Output.empty() : this.loggingConfig;
    }

    /**
     * Required. The HCFS URI of the main R file to use as the driver. Must be a .R file.
     * 
     */
    @Import(name="mainRFileUri", required=true)
      private final Output<String> mainRFileUri;

    public Output<String> getMainRFileUri() {
        return this.mainRFileUri;
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    public WorkflowTemplateJobSparkRJobGetArgs(
        @Nullable Output<List<String>> archiveUris,
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> fileUris,
        @Nullable Output<WorkflowTemplateJobSparkRJobLoggingConfigGetArgs> loggingConfig,
        Output<String> mainRFileUri,
        @Nullable Output<Map<String,String>> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.loggingConfig = loggingConfig;
        this.mainRFileUri = Objects.requireNonNull(mainRFileUri, "expected parameter 'mainRFileUri' to be non-null");
        this.properties = properties;
    }

    private WorkflowTemplateJobSparkRJobGetArgs() {
        this.archiveUris = Output.empty();
        this.args = Output.empty();
        this.fileUris = Output.empty();
        this.loggingConfig = Output.empty();
        this.mainRFileUri = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobSparkRJobGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> archiveUris;
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> fileUris;
        private @Nullable Output<WorkflowTemplateJobSparkRJobLoggingConfigGetArgs> loggingConfig;
        private Output<String> mainRFileUri;
        private @Nullable Output<Map<String,String>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobSparkRJobGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainRFileUri = defaults.mainRFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder archiveUris(@Nullable Output<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }
        public Builder archiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Output.ofNullable(archiveUris);
            return this;
        }
        public Builder archiveUris(String... archiveUris) {
            return archiveUris(List.of(archiveUris));
        }
        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder fileUris(@Nullable Output<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }
        public Builder fileUris(@Nullable List<String> fileUris) {
            this.fileUris = Output.ofNullable(fileUris);
            return this;
        }
        public Builder fileUris(String... fileUris) {
            return fileUris(List.of(fileUris));
        }
        public Builder loggingConfig(@Nullable Output<WorkflowTemplateJobSparkRJobLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }
        public Builder loggingConfig(@Nullable WorkflowTemplateJobSparkRJobLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Output.ofNullable(loggingConfig);
            return this;
        }
        public Builder mainRFileUri(Output<String> mainRFileUri) {
            this.mainRFileUri = Objects.requireNonNull(mainRFileUri);
            return this;
        }
        public Builder mainRFileUri(String mainRFileUri) {
            this.mainRFileUri = Output.of(Objects.requireNonNull(mainRFileUri));
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }        public WorkflowTemplateJobSparkRJobGetArgs build() {
            return new WorkflowTemplateJobSparkRJobGetArgs(archiveUris, args, fileUris, loggingConfig, mainRFileUri, properties);
        }
    }
}
