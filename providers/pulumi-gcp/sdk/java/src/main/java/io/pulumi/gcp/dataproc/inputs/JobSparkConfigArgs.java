// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.JobSparkConfigLoggingConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobSparkConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSparkConfigArgs Empty = new JobSparkConfigArgs();

    /**
     * HCFS URIs of archives to be extracted in the working directory of .jar, .tar, .tar.gz, .tgz, and .zip.
     * 
     */
    @InputImport(name="archiveUris")
      private final @Nullable Input<List<String>> archiveUris;

    public Input<List<String>> getArchiveUris() {
        return this.archiveUris == null ? Input.empty() : this.archiveUris;
    }

    /**
     * The arguments to pass to the driver. Do not include arguments, such as -libjars or -Dfoo=bar, that can be set as job properties, since a collision may occur that causes an incorrect job submission.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Input<List<String>> args;

    public Input<List<String>> getArgs() {
        return this.args == null ? Input.empty() : this.args;
    }

    /**
     * HCFS URIs of files to be copied to the working directory of Hadoop drivers and distributed tasks. Useful for naively parallel tasks.
     * 
     */
    @InputImport(name="fileUris")
      private final @Nullable Input<List<String>> fileUris;

    public Input<List<String>> getFileUris() {
        return this.fileUris == null ? Input.empty() : this.fileUris;
    }

    /**
     * HCFS URIs of jar files to be added to the Spark CLASSPATH.
     * 
     */
    @InputImport(name="jarFileUris")
      private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    @InputImport(name="loggingConfig")
      private final @Nullable Input<JobSparkConfigLoggingConfigArgs> loggingConfig;

    public Input<JobSparkConfigLoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * The name of the driver's main class. The jar file containing the class must be in the default CLASSPATH or specified in `jar_file_uris`. Conflicts with `main_jar_file_uri`
     * 
     */
    @InputImport(name="mainClass")
      private final @Nullable Input<String> mainClass;

    public Input<String> getMainClass() {
        return this.mainClass == null ? Input.empty() : this.mainClass;
    }

    /**
     * The HCFS URI of the jar file containing the main class. Examples: 'gs://foo-bucket/analytics-binaries/extract-useful-metrics-mr.jar' 'hdfs:/tmp/test-samples/custom-wordcount.jar' 'file:///home/usr/lib/hadoop-mapreduce/hadoop-mapreduce-examples.jar'. Conflicts with `main_class`
     * 
     */
    @InputImport(name="mainJarFileUri")
      private final @Nullable Input<String> mainJarFileUri;

    public Input<String> getMainJarFileUri() {
        return this.mainJarFileUri == null ? Input.empty() : this.mainJarFileUri;
    }

    /**
     * A mapping of property names to values, used to configure Spark SQL's SparkConf. Properties that conflict with values set by the Cloud Dataproc API may be overwritten.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public JobSparkConfigArgs(
        @Nullable Input<List<String>> archiveUris,
        @Nullable Input<List<String>> args,
        @Nullable Input<List<String>> fileUris,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<JobSparkConfigLoggingConfigArgs> loggingConfig,
        @Nullable Input<String> mainClass,
        @Nullable Input<String> mainJarFileUri,
        @Nullable Input<Map<String,String>> properties) {
        this.archiveUris = archiveUris;
        this.args = args;
        this.fileUris = fileUris;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.mainClass = mainClass;
        this.mainJarFileUri = mainJarFileUri;
        this.properties = properties;
    }

    private JobSparkConfigArgs() {
        this.archiveUris = Input.empty();
        this.args = Input.empty();
        this.fileUris = Input.empty();
        this.jarFileUris = Input.empty();
        this.loggingConfig = Input.empty();
        this.mainClass = Input.empty();
        this.mainJarFileUri = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSparkConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> archiveUris;
        private @Nullable Input<List<String>> args;
        private @Nullable Input<List<String>> fileUris;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<JobSparkConfigLoggingConfigArgs> loggingConfig;
        private @Nullable Input<String> mainClass;
        private @Nullable Input<String> mainJarFileUri;
        private @Nullable Input<Map<String,String>> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSparkConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.archiveUris = defaults.archiveUris;
    	      this.args = defaults.args;
    	      this.fileUris = defaults.fileUris;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.mainClass = defaults.mainClass;
    	      this.mainJarFileUri = defaults.mainJarFileUri;
    	      this.properties = defaults.properties;
        }

        public Builder setArchiveUris(@Nullable Input<List<String>> archiveUris) {
            this.archiveUris = archiveUris;
            return this;
        }

        public Builder setArchiveUris(@Nullable List<String> archiveUris) {
            this.archiveUris = Input.ofNullable(archiveUris);
            return this;
        }

        public Builder setArgs(@Nullable Input<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder setArgs(@Nullable List<String> args) {
            this.args = Input.ofNullable(args);
            return this;
        }

        public Builder setFileUris(@Nullable Input<List<String>> fileUris) {
            this.fileUris = fileUris;
            return this;
        }

        public Builder setFileUris(@Nullable List<String> fileUris) {
            this.fileUris = Input.ofNullable(fileUris);
            return this;
        }

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<JobSparkConfigLoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable JobSparkConfigLoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setMainClass(@Nullable Input<String> mainClass) {
            this.mainClass = mainClass;
            return this;
        }

        public Builder setMainClass(@Nullable String mainClass) {
            this.mainClass = Input.ofNullable(mainClass);
            return this;
        }

        public Builder setMainJarFileUri(@Nullable Input<String> mainJarFileUri) {
            this.mainJarFileUri = mainJarFileUri;
            return this;
        }

        public Builder setMainJarFileUri(@Nullable String mainJarFileUri) {
            this.mainJarFileUri = Input.ofNullable(mainJarFileUri);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public JobSparkConfigArgs build() {
            return new JobSparkConfigArgs(archiveUris, args, fileUris, jarFileUris, loggingConfig, mainClass, mainJarFileUri, properties);
        }
    }
}
