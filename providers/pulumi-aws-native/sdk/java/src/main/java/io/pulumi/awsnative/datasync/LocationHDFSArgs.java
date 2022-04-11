// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.enums.LocationHDFSAuthenticationType;
import io.pulumi.awsnative.datasync.inputs.LocationHDFSNameNodeArgs;
import io.pulumi.awsnative.datasync.inputs.LocationHDFSQopConfigurationArgs;
import io.pulumi.awsnative.datasync.inputs.LocationHDFSTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationHDFSArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationHDFSArgs Empty = new LocationHDFSArgs();

    /**
     * ARN(s) of the agent(s) to use for an HDFS location.
     * 
     */
    @Import(name="agentArns", required=true)
      private final Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }

    /**
     * The authentication mode used to determine identity of user.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<LocationHDFSAuthenticationType> authenticationType;

    public Output<LocationHDFSAuthenticationType> getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Size of chunks (blocks) in bytes that the data is divided into when stored in the HDFS cluster.
     * 
     */
    @Import(name="blockSize")
      private final @Nullable Output<Integer> blockSize;

    public Output<Integer> getBlockSize() {
        return this.blockSize == null ? Codegen.empty() : this.blockSize;
    }

    /**
     * The Base64 string representation of the Keytab file.
     * 
     */
    @Import(name="kerberosKeytab")
      private final @Nullable Output<String> kerberosKeytab;

    public Output<String> getKerberosKeytab() {
        return this.kerberosKeytab == null ? Codegen.empty() : this.kerberosKeytab;
    }

    /**
     * The string representation of the Krb5Conf file, or the presigned URL to access the Krb5.conf file within an S3 bucket.
     * 
     */
    @Import(name="kerberosKrb5Conf")
      private final @Nullable Output<String> kerberosKrb5Conf;

    public Output<String> getKerberosKrb5Conf() {
        return this.kerberosKrb5Conf == null ? Codegen.empty() : this.kerberosKrb5Conf;
    }

    /**
     * The unique identity, or principal, to which Kerberos can assign tickets.
     * 
     */
    @Import(name="kerberosPrincipal")
      private final @Nullable Output<String> kerberosPrincipal;

    public Output<String> getKerberosPrincipal() {
        return this.kerberosPrincipal == null ? Codegen.empty() : this.kerberosPrincipal;
    }

    /**
     * The identifier for the Key Management Server where the encryption keys that encrypt data inside HDFS clusters are stored.
     * 
     */
    @Import(name="kmsKeyProviderUri")
      private final @Nullable Output<String> kmsKeyProviderUri;

    public Output<String> getKmsKeyProviderUri() {
        return this.kmsKeyProviderUri == null ? Codegen.empty() : this.kmsKeyProviderUri;
    }

    /**
     * An array of Name Node(s) of the HDFS location.
     * 
     */
    @Import(name="nameNodes", required=true)
      private final Output<List<LocationHDFSNameNodeArgs>> nameNodes;

    public Output<List<LocationHDFSNameNodeArgs>> getNameNodes() {
        return this.nameNodes;
    }

    @Import(name="qopConfiguration")
      private final @Nullable Output<LocationHDFSQopConfigurationArgs> qopConfiguration;

    public Output<LocationHDFSQopConfigurationArgs> getQopConfiguration() {
        return this.qopConfiguration == null ? Codegen.empty() : this.qopConfiguration;
    }

    /**
     * Number of copies of each block that exists inside the HDFS cluster.
     * 
     */
    @Import(name="replicationFactor")
      private final @Nullable Output<Integer> replicationFactor;

    public Output<Integer> getReplicationFactor() {
        return this.replicationFactor == null ? Codegen.empty() : this.replicationFactor;
    }

    /**
     * The user name that has read and write permissions on the specified HDFS cluster.
     * 
     */
    @Import(name="simpleUser")
      private final @Nullable Output<String> simpleUser;

    public Output<String> getSimpleUser() {
        return this.simpleUser == null ? Codegen.empty() : this.simpleUser;
    }

    /**
     * The subdirectory in HDFS that is used to read data from the HDFS source location or write data to the HDFS destination.
     * 
     */
    @Import(name="subdirectory")
      private final @Nullable Output<String> subdirectory;

    public Output<String> getSubdirectory() {
        return this.subdirectory == null ? Codegen.empty() : this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<LocationHDFSTagArgs>> tags;

    public Output<List<LocationHDFSTagArgs>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public LocationHDFSArgs(
        Output<List<String>> agentArns,
        Output<LocationHDFSAuthenticationType> authenticationType,
        @Nullable Output<Integer> blockSize,
        @Nullable Output<String> kerberosKeytab,
        @Nullable Output<String> kerberosKrb5Conf,
        @Nullable Output<String> kerberosPrincipal,
        @Nullable Output<String> kmsKeyProviderUri,
        Output<List<LocationHDFSNameNodeArgs>> nameNodes,
        @Nullable Output<LocationHDFSQopConfigurationArgs> qopConfiguration,
        @Nullable Output<Integer> replicationFactor,
        @Nullable Output<String> simpleUser,
        @Nullable Output<String> subdirectory,
        @Nullable Output<List<LocationHDFSTagArgs>> tags) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.blockSize = blockSize;
        this.kerberosKeytab = kerberosKeytab;
        this.kerberosKrb5Conf = kerberosKrb5Conf;
        this.kerberosPrincipal = kerberosPrincipal;
        this.kmsKeyProviderUri = kmsKeyProviderUri;
        this.nameNodes = Objects.requireNonNull(nameNodes, "expected parameter 'nameNodes' to be non-null");
        this.qopConfiguration = qopConfiguration;
        this.replicationFactor = replicationFactor;
        this.simpleUser = simpleUser;
        this.subdirectory = subdirectory;
        this.tags = tags;
    }

    private LocationHDFSArgs() {
        this.agentArns = Codegen.empty();
        this.authenticationType = Codegen.empty();
        this.blockSize = Codegen.empty();
        this.kerberosKeytab = Codegen.empty();
        this.kerberosKrb5Conf = Codegen.empty();
        this.kerberosPrincipal = Codegen.empty();
        this.kmsKeyProviderUri = Codegen.empty();
        this.nameNodes = Codegen.empty();
        this.qopConfiguration = Codegen.empty();
        this.replicationFactor = Codegen.empty();
        this.simpleUser = Codegen.empty();
        this.subdirectory = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHDFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> agentArns;
        private Output<LocationHDFSAuthenticationType> authenticationType;
        private @Nullable Output<Integer> blockSize;
        private @Nullable Output<String> kerberosKeytab;
        private @Nullable Output<String> kerberosKrb5Conf;
        private @Nullable Output<String> kerberosPrincipal;
        private @Nullable Output<String> kmsKeyProviderUri;
        private Output<List<LocationHDFSNameNodeArgs>> nameNodes;
        private @Nullable Output<LocationHDFSQopConfigurationArgs> qopConfiguration;
        private @Nullable Output<Integer> replicationFactor;
        private @Nullable Output<String> simpleUser;
        private @Nullable Output<String> subdirectory;
        private @Nullable Output<List<LocationHDFSTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationHDFSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.authenticationType = defaults.authenticationType;
    	      this.blockSize = defaults.blockSize;
    	      this.kerberosKeytab = defaults.kerberosKeytab;
    	      this.kerberosKrb5Conf = defaults.kerberosKrb5Conf;
    	      this.kerberosPrincipal = defaults.kerberosPrincipal;
    	      this.kmsKeyProviderUri = defaults.kmsKeyProviderUri;
    	      this.nameNodes = defaults.nameNodes;
    	      this.qopConfiguration = defaults.qopConfiguration;
    	      this.replicationFactor = defaults.replicationFactor;
    	      this.simpleUser = defaults.simpleUser;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder agentArns(Output<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }
        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Output.of(Objects.requireNonNull(agentArns));
            return this;
        }
        public Builder agentArns(String... agentArns) {
            return agentArns(List.of(agentArns));
        }
        public Builder authenticationType(Output<LocationHDFSAuthenticationType> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(LocationHDFSAuthenticationType authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }
        public Builder blockSize(@Nullable Output<Integer> blockSize) {
            this.blockSize = blockSize;
            return this;
        }
        public Builder blockSize(@Nullable Integer blockSize) {
            this.blockSize = Codegen.ofNullable(blockSize);
            return this;
        }
        public Builder kerberosKeytab(@Nullable Output<String> kerberosKeytab) {
            this.kerberosKeytab = kerberosKeytab;
            return this;
        }
        public Builder kerberosKeytab(@Nullable String kerberosKeytab) {
            this.kerberosKeytab = Codegen.ofNullable(kerberosKeytab);
            return this;
        }
        public Builder kerberosKrb5Conf(@Nullable Output<String> kerberosKrb5Conf) {
            this.kerberosKrb5Conf = kerberosKrb5Conf;
            return this;
        }
        public Builder kerberosKrb5Conf(@Nullable String kerberosKrb5Conf) {
            this.kerberosKrb5Conf = Codegen.ofNullable(kerberosKrb5Conf);
            return this;
        }
        public Builder kerberosPrincipal(@Nullable Output<String> kerberosPrincipal) {
            this.kerberosPrincipal = kerberosPrincipal;
            return this;
        }
        public Builder kerberosPrincipal(@Nullable String kerberosPrincipal) {
            this.kerberosPrincipal = Codegen.ofNullable(kerberosPrincipal);
            return this;
        }
        public Builder kmsKeyProviderUri(@Nullable Output<String> kmsKeyProviderUri) {
            this.kmsKeyProviderUri = kmsKeyProviderUri;
            return this;
        }
        public Builder kmsKeyProviderUri(@Nullable String kmsKeyProviderUri) {
            this.kmsKeyProviderUri = Codegen.ofNullable(kmsKeyProviderUri);
            return this;
        }
        public Builder nameNodes(Output<List<LocationHDFSNameNodeArgs>> nameNodes) {
            this.nameNodes = Objects.requireNonNull(nameNodes);
            return this;
        }
        public Builder nameNodes(List<LocationHDFSNameNodeArgs> nameNodes) {
            this.nameNodes = Output.of(Objects.requireNonNull(nameNodes));
            return this;
        }
        public Builder nameNodes(LocationHDFSNameNodeArgs... nameNodes) {
            return nameNodes(List.of(nameNodes));
        }
        public Builder qopConfiguration(@Nullable Output<LocationHDFSQopConfigurationArgs> qopConfiguration) {
            this.qopConfiguration = qopConfiguration;
            return this;
        }
        public Builder qopConfiguration(@Nullable LocationHDFSQopConfigurationArgs qopConfiguration) {
            this.qopConfiguration = Codegen.ofNullable(qopConfiguration);
            return this;
        }
        public Builder replicationFactor(@Nullable Output<Integer> replicationFactor) {
            this.replicationFactor = replicationFactor;
            return this;
        }
        public Builder replicationFactor(@Nullable Integer replicationFactor) {
            this.replicationFactor = Codegen.ofNullable(replicationFactor);
            return this;
        }
        public Builder simpleUser(@Nullable Output<String> simpleUser) {
            this.simpleUser = simpleUser;
            return this;
        }
        public Builder simpleUser(@Nullable String simpleUser) {
            this.simpleUser = Codegen.ofNullable(simpleUser);
            return this;
        }
        public Builder subdirectory(@Nullable Output<String> subdirectory) {
            this.subdirectory = subdirectory;
            return this;
        }
        public Builder subdirectory(@Nullable String subdirectory) {
            this.subdirectory = Codegen.ofNullable(subdirectory);
            return this;
        }
        public Builder tags(@Nullable Output<List<LocationHDFSTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<LocationHDFSTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(LocationHDFSTagArgs... tags) {
            return tags(List.of(tags));
        }        public LocationHDFSArgs build() {
            return new LocationHDFSArgs(agentArns, authenticationType, blockSize, kerberosKeytab, kerberosKrb5Conf, kerberosPrincipal, kmsKeyProviderUri, nameNodes, qopConfiguration, replicationFactor, simpleUser, subdirectory, tags);
        }
    }
}
